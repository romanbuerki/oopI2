package ch.fhnw.oopI2.wo4.BossPuzzle;

import javax.swing.*;
import java.awt.*;

public class BossPuzzle extends JFrame {

    private JButton[] buttons;
    private JButton startButton;
    private JLabel ausgabe;
    private JLabel titel;

    public BossPuzzle()
    {
        super("Boss Puzzle");

        startButton = new JButton("Start");
        ausgabe = new JLabel("");
        titel = new JLabel("Willkommen");

        BorderLayout allOverLayout = new BorderLayout();
        GridLayout buttonLayout = new GridLayout(3,3);
        GridLayout controlLayout = new GridLayout()


    }


}
