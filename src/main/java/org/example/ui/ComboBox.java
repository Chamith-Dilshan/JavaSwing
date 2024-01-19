package org.example.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox implements ActionListener {

    JComboBox comboBox;
    public ComboBox(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        String[] animals = {"Dogs", "Cats", "Birds"};//you need to use a reference class to add items. ex: Double,Integer,String
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        //comboBox.setEditable(true);
        //comboBox.addItem("Fish");
        //comboBox.insertItemAt("Flower",0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("Cats");
        //comboBox.removeItemAt(1);
        //comboBox.removeAllItems();

        frame.add(comboBox);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox){
            //System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
    //a component tha combine a button or editable field and a drop-down list

}
