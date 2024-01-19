package org.example.ui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label extends JLabel {
    public Label(){
        ImageIcon imageIcon = new ImageIcon("src/main/resources/images/icon.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);

        this.setText("Hello Title");
        this.setIcon(imageIcon);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setForeground(Color.orange);
        this.setBackground(Color.BLUE);
        this.setOpaque(true);
        this.setBorder(border);
        this.setFont(new Font("MV Boli",Font.BOLD,20));
        this.setIconTextGap(10);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setBounds(0,0,200,200);
        this.setVisible(true);

    }
}
