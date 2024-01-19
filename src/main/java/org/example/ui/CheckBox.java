package org.example.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox implements ActionListener {

    Button button;
    JCheckBox checkBox;
    ImageIcon icon1;
    ImageIcon icon2;
    public CheckBox(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        icon1 = new ImageIcon("src/main/resources/images/icon.png");
        icon2 = new ImageIcon("src/main/resources/images/icon.png");

        button = new Button();
        button.setText("Click");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.BOLD,25));
        checkBox.setIcon(icon1);
        checkBox.setSelectedIcon(icon2);

        frame.add(button);
        frame.add(checkBox);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println(checkBox.isSelected());

        }
    }
}
