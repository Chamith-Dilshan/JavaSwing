package org.example.ui;

import javax.swing.*;
import java.awt.*;

public class JLayerPane {
    // it is a container that provides a third dimension for positioning
    // components. Ex- Depth, Z-index

    public void JlayerPane(){
        Frame frame = new Frame();
        JLayeredPane layerPane = new JLayeredPane();

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.GRAY);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.RED);
        label2.setBounds(100,100,200,200);
        
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLACK);
        label3.setBounds(150,150,200,200);

        layerPane.setBounds(0,0,500,500);
        layerPane.add(label1,Integer.valueOf(0));
        layerPane.add(label2,JLayeredPane.DEFAULT_LAYER);
        layerPane.add(label3,JLayeredPane.DRAG_LAYER);
        frame.add(layerPane);
    }
}