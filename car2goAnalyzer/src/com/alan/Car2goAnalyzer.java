package com.alan;

/**
 * Created by alanli on 15-10-03.
 */

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//import org.omg.CORBA.Current;
//import java.io.FileReader;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.URL;


public class Car2goAnalyzer {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        Car2goData car2goData = new Car2goData();
        CurrentTime curTime = new CurrentTime();
        JSONParser parser = new JSONParser();
        String currentTime = "";
        //--------------------specify OUTPUT path------------------------------------------
        //FileWriter file = new FileWriter("/Users/alanli/Desktop/Car2Go/Output/test123.json");
        //---------------------------------------------------------------------------------

        try {
            int counter = 0; //DELETE*********************************************************************************
            while(counter<10) {  //while(true)************************************************************************
                currentTime = curTime.getCurTime();
                FileWriter file = new FileWriter("/Users/alanli/Desktop/Car2Go/Output/"+currentTime+".json");
                Object obj = parser.parse(car2goData.getData());

                //            Object obj = parser.parse(new FileReader(
                //                    "/Users/alanli/Desktop/Car2Go/Data/car2goByHour/Oct3_6_12_pm.json"));
                //            Object obj = Car2goData.getData();

                JSONObject jsonObject = (JSONObject) obj;
                JSONArray placemarks = (JSONArray) jsonObject.get("placemarks");

                int count = placemarks.size();
                System.out.println("NUMBER OF CARS AVAILABLE: " + count);

//                String indexHeader = "";

                for (int i = 0; i < count; i++) {
                    JSONObject car = (JSONObject) placemarks.get(i);
                    //----------------------ADD timestamp HERE---------------
                    car.put("time", currentTime);
                    //----------------------INSERT indexHEADER HERE----------
                    file.write("{ \"index\": { \"_index\": \"car2go\", \"_type\": \"cars\" }}\n");
                    file.write(car.toJSONString());
                    file.write("\n");
                    //-------------------------------------------------------
                }
                file.flush();
                file.close();
                Thread.sleep( 300 * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("SUCCESS!");
        }

    }
}