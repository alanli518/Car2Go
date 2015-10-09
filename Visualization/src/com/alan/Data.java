package com.alan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Data {
    //        ********************************************
    private double[][] xPts = new double[360][382];
    private double[][] yPts = new double[360][382];
    private int loop;
    private String line;
    private String stringArray;

    public Data() {
        this.loop = 0;
        try {
            FileReader fileReader = new FileReader("/Users/alanli/Desktop/Car2Go/Visualization/res/xArray.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            while ((line = bufferedReader.readLine()) != null) {
//                stringArray += line;
//            }
            for(int a = 0; a < 382; a++){
                for(int b = 0; b < 360; b++){
                    try {
                        if((line = bufferedReader.readLine()) != null){
                            xPts[b][a] = Double.parseDouble(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            fileReader = new FileReader("/Users/alanli/Desktop/Car2Go/Visualization/res/yArray.txt");
            bufferedReader = new BufferedReader(fileReader);
//            while ((line = bufferedReader.readLine()) != null) {
//                stringArray += line;
//            }
            for(int a = 0; a < 382; a++){
                for(int b = 0; b < 360; b++){
                    try {
                        if((line = bufferedReader.readLine()) != null){
                            yPts[b][a] = Double.parseDouble(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public double[][] getxPts() {
        return xPts;
    }

    public double[][] getyPts() {
        return yPts;
    }

    public int getLoop() {
        return loop;
    }

    public void incLoop() {
        this.loop += 1;
    }


    //        ********************************************

}
