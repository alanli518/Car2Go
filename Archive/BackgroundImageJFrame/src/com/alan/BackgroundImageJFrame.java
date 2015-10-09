package com.alan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class BackgroundImageJFrame extends JFrame
{

    public BackgroundImageJFrame()
    {
        setTitle("Background Color for JFrame");
        setSize(1265,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("/Users/alanli/Desktop/map_small.png")));
        setLayout(new FlowLayout());
//        Just for refresh :) Not optional!
        setSize(1264,799);
        setSize(1265,800);
    }
    public static void main(String args[])
    {
        new BackgroundImageJFrame();
    }
}