package ch.fhnw.oopI2.wo4.Messstation;

import java.util.ArrayList;

public class Network {

    public static void main(String[] args)
    {

        ControlCenter controlCenter = new ControlCenter();

        ArrayList<Station> list = new ArrayList<Station>(40);

        for (int i = 0; i < 40; i++)
        {
            list.add(new Station());
        }

        for (int i = 0; i < list.size(); i++)
        {
            list.get(i).addObserver(controlCenter);
        }

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = 0; j < 20; j++)
            {
                list.get(i).nextMeasurement();
            }
        }


    }

}
