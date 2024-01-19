package org.example.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenNewWindow implements ActionListener {
    JFrame frame = new JFrame();
    Button button = new Button();
    public OpenNewWindow(){
        frame.setSize(500,500);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Hello");
        frame.setLayout(null);

        button.addActionListener(this);
        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            frame.dispose();
            NewWindow newWindow = new NewWindow();
        }
    }
}
