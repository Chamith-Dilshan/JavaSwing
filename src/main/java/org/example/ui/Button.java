package org.example.ui;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    Button(){
        //ImageIcon icon = new ImageIcon("src/main/resources/images/icon.png");

        this.setBounds(200,100,100,50);
        this.setText("Don't Click");
        this.setFocusable(false);
        //this.setIcon(icon);
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.BOTTOM);
        this.setFont(new Font("Comic Sans",Font.BOLD,20));
        this.setIconTextGap(-10);
        this.setForeground(Color.BLUE);
        this.setBackground(Color.CYAN);
        this.setBorder(BorderFactory.createBevelBorder(10));
        //this.setEnabled(false);
    }
}
