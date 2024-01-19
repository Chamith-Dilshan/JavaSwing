package org.example.ui;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    
    public Frame(){
        this.setSize(500,500);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Convertor");
        // if change the default value of setLayout method
        //you have to specify the bounds of the components
        // you can use flowLayout or borderLayout
        this.setLayout(null);

        ImageIcon image = new ImageIcon("src/main/resources/images/icon.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(45,30,60));

        //add label
        Label label = new Label();
        this.add(label);
        this.setVisible(true);

        //this.pack();//this will adjust the size to fit all the components
        //if you are using pack method, make sure you added all the components before you use this method
    }
}
