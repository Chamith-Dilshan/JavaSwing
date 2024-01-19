package org.example.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameForButton extends JFrame implements ActionListener {
    Button button;
    Label label;
    public FrameForButton(){
        button =new Button();
        button.addActionListener(this);

        label = new Label();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    //you need to implements the actionlistner or lambda to use the button.
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Human");
            label.setVisible(true);
        }
    }
}
