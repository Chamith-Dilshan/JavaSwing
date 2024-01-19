package org.example.ui;

import javax.swing.*;

public class JoptionPane{
    //pop up a standard dialog box that prompts users for a value
    //or informs them of something.
    public JoptionPane(){
        //JOptionPane.showMessageDialog(null,"This is a Message","World",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is a Message","World",JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is a Message","World",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is a Message","World",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is a Message","World",JOptionPane.INFORMATION_MESSAGE);

        //you can store the output in a variable and use it using if else or switch
        //int answer = JOptionPane.showConfirmDialog(null,"Are you sure?","Conformation",JOptionPane.YES_NO_OPTION);

        //String name = JOptionPane.showInputDialog("What is your name? ");
        //System.out.println(name);

        //this one has more customizations
        String[] options = {"Yes","LoL","Fuck!"};
        JOptionPane.showOptionDialog(null,"You are Great","Title",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE,null,options,0);
    }
}
