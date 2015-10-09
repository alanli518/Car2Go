package com.alan;

import javax.swing.*;
import java.awt.*;

/**
 * Created by alanli on 2015-10-04.
 */
public class MyFrame extends JFrame {

    public MyFrame(){
        super("My Frame");

        //you can set the content pane of the frame
        //to your custom class.

//        setContentPane(new DrawPane());
        setContentPane(new JLabel(new ImageIcon("/Users/alanli/Desktop/map_small.png")));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(1265, 800);

        setVisible(true);
    }

    //create a component that you can actually draw on.
    class DrawPane extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            //draw on g here e.g.
            g.setColor(Color.RED);
            g.fillOval(20, 20, 100, 200);
        }
    }

    public static void main(String args[]){
        new MyFrame();


    }

}