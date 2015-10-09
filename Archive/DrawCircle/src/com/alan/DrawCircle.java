package com.alan;

import javax.swing.*;
import java.lang.*;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class DrawCircle extends JFrame {

    public void paint(Graphics g) {
        Graphics2D ga = (Graphics2D)g;
        ga.setPaint(Color.red);
        ga.fillOval(150,150,10,10);
    }

    public static void main(String args[])
    {
        DrawCircle frame = new DrawCircle();
        frame.addWindowListener(
                new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we)
                    {
                        System.exit(0);
                    }
                }
        );

//        frame.setSize(1898, 1200);
        frame.setSize(1265, 800);
        frame.setVisible(true);
    }
}