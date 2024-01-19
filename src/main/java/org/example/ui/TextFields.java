package org.example.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFields implements ActionListener {

    Button button;
    JTextField textField;

    public TextFields(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.ITALIC,25));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.GRAY);
        textField.setCaretColor(Color.ORANGE);
        textField.setText("User name");

        button = new Button();
        button.addActionListener(this);

        frame.add(button);
        frame.add(textField);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            button.setEnabled(false);
            textField.setEnabled(false);
            System.out.println(textField.getText());
        }
    }
    // GUI component that can be used to add, set, or get text

}
