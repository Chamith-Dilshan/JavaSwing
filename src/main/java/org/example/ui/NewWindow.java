package org.example.ui;

import javax.swing.*;

public class NewWindow {
    JFrame frame = new JFrame();
    public NewWindow(){
        frame.setSize(500,500);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Hello");
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
