package org.example.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Radiobutton implements ActionListener {

    JRadioButton button1;
    JRadioButton button2;
    JRadioButton button3;
    public Radiobutton(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        button1 = new JRadioButton("pizza");
        button2 = new JRadioButton("hamburger");
        button3 = new JRadioButton("hot-dog");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        ButtonGroup group =new ButtonGroup();//you can limit the choices by grouping
        group.add(button1);
        group.add(button2);
        group.add(button3);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            System.out.println("Pizza");
        }
        else if(e.getSource() == button2){
            System.out.println("hamburger");

        } else if (e.getSource() == button3) {
            System.out.println("hot-dog");
        }
    }
    //one or more buttons in a grouping in which only 1 may selected per group

}
