package org.example.ui;

import javax.swing.*;
import java.awt.*;

public class LayoutManagers {
    //Layout Managers defines the layout for components within a container.
    //there are 3 Layout managers - BorderLayout,FlowLayout,GridLayout

    //BorderLayout - A BorderLayout(Default Layout) Places components in 5 areas -
    //               NORTH,SOUTH,WEST,EAST,CENTER all extra space is placed in the CENTER area.

    //FlowLayout - Places components in a row, sized at their preferred size.
    //            if the horizontal space in the container is too small, the FLowLayout class
    //            uses the next available row.

    //GridLayout - Place Components in a grid cells.
    //             Each components take all the available space within the cell,
    //             and each cell is the same size

    public void BorderLayout(){
        Frame frame = new Frame();
        frame.setLayout(new BorderLayout(10,10));//add margin
        Panel panel1 = new Panel(Color.blue,100,100 );
        Panel panel2 = new Panel(Color.CYAN,100,100);
        Panel panel3 = new Panel(Color.GREEN,100,100);
        Panel panel4 = new Panel(Color.magenta,100,100);
        Panel panel5 = new Panel(Color.PINK,100,100);

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.EAST);
        frame.add(panel3,BorderLayout.CENTER);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.WEST);

        //---------Sub Panels -----------
        panel3.setLayout(new BorderLayout());
        Panel panel6 = new Panel(Color.BLACK,50,50 );
        panel3.add(panel6,BorderLayout.NORTH);
    }

    public void FlowLayout(){
        Frame frame = new Frame();
        Panel panel = new Panel(Color.GREEN,250,550);
        panel.setLayout(new FlowLayout());
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));

        frame.add(panel);
        frame.setVisible(true);
        //panel.setVisible(true);
    }
    public void GridLayout(){
        Frame frame = new Frame();
        frame.setLayout(new GridLayout(9,1,10,10));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));

        frame.setVisible(true);
    }
}


