package org.example.ui;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Panel(java.awt.Color color,int width, int height){
        this.setBackground(color);
        this.setPreferredSize(new Dimension(width,height));
        //this.setBounds(x,y,width,height);
        this.setPreferredSize(new Dimension(100,100));
    }
}
