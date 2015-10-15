package com.alan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Data {
    /**
     Data points starts at 11:26am on 10-04-2015 and ends at 7:18pm on 10-05-2015
     11:26am is 1443972398000 in UTC milliseconds
     360 is max number of cars available at any given time
     382 is number of data points, in 5 min intervals between 11:26am and 7:18pm
     */

    private double[][] xPts = new double[360][382];
    private double[][] yPts = new double[360][382];
    private int loop;
    private String line;
    private long timeInMS;


    public Data() {
        this.loop = 0;
        this.timeInMS = 1443972398000L;
        try {
            FileReader fileReader = new FileReader("/Users/alanli/Documents/Car2Go-Project/Visualization/res/xArray.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

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

            fileReader = new FileReader("/Users/alanli/Documents/Car2Go-Project/Visualization/res/yArray.txt");
            bufferedReader = new BufferedReader(fileReader);

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

    public long getTimeInMS() {
        return timeInMS;
    }

    public void incTimeInMS() {
        this.timeInMS += 300000;
    }

    public int getLoop() {
        return loop;
    }

    public void incLoop() {
        System.out.println(getDate(getTimeInMS(), "dd/MM/yyyy hh:mm"));
        incTimeInMS();
        this.loop += 1;
    }

    public static String getDate(long milliSeconds, String dateFormat)
    {
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliSeconds);
        return formatter.format(calendar.getTime());
    }

}
