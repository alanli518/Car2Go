package com.alan;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

class Surface extends JPanel implements ActionListener{

    private Image bgImage;
    private final int DELAY = 1000;
    private Timer timer;
    Data xy = new Data();

    public Surface() {
        initTimer();
        loadImage();
        setSurfaceSize();
    }

    private void initTimer() {

        timer = new Timer(DELAY, this);
        timer.start();
    }

    public Timer getTimer() {

        return timer;
    }


    private void loadImage() {

        bgImage = new ImageIcon("/Users/alanli/Documents/Car2Go-Project/Visualization/res/1200800.png").getImage();
    }

    private void setSurfaceSize() {

        Dimension d = new Dimension();
        d.width = bgImage.getWidth(null);
        d.height = bgImage.getHeight(null);
        setPreferredSize(d);
    }

    private void doDrawing(Graphics g, Data xy) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(bgImage, 0, 0, null);
        g2d.setColor(Color.BLUE);

        double xPts[][] = xy.getxPts();
        double yPts[][] = xy.getyPts();
        int loop = xy.getLoop();
        /**
         * below is the formula for mapping GPS points to the background map image
         * using the 4 corners of the map image as reference points
         */
        for (int z = 0; z < 360; z++) {
            int x = (int)((yPts[z][loop]+79.511267)/.224217*1200);
            int y = (int)(800-((xPts[z][loop]-43.626395)/.10541*800));
            g2d.fillOval(x, y, 10, 10);
        }
        xy.incLoop();
        if(xy.getLoop() > 381){
            System.exit(0);
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g, xy);
        try {
            Thread.sleep(100);
            repaint();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}

public class DisplayImageEx extends JFrame {

    public DisplayImageEx() {

        initUI();
    }

    private void initUI() {

        final Surface surface = new Surface();
        add(new Surface());

        pack();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Timer timer = surface.getTimer();
                timer.stop();
            }
        });

        setTitle("Car2Go");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DisplayImageEx ex = new DisplayImageEx();
                ex.setVisible(true);
            }
        });
    }
}