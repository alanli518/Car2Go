package com.alan;

/**
 * Created by alanli on 15-10-03.
 *
 * This program scrapes Car2Go data in Toronto from the Car2Go API every 5 minutes and
 * saves the information in a JSON file.
 *
 * Every time data is scraped, an Elasticsearch header is added before each Car object
 * data point so that it can be bulk uploaded into Elasticsearch. Each file is saved
 * with a timestamp as an identifier of when the data was captured.
 *
 * A timestamp is also inserted into every Car object in each JSON file for visualization
 * using another program.
 */

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.omg.CORBA.Current;


public class Car2goAnalyzer {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        JSONParser parser = new JSONParser();
        String currentTime;

        try {
            while(true) {
                currentTime = CurrentTime.getCurTime();
                //--------------------------SPECIFY output location HERE-----
                FileWriter file = new FileWriter("/Users/alanli/Desktop/"+currentTime+".json");
                Object obj = parser.parse(Car2goData.getData());

                JSONObject jsonObject = (JSONObject) obj;
                JSONArray placemarks = (JSONArray) jsonObject.get("placemarks");

                int count = placemarks.size();
                System.out.println("NUMBER OF CARS AVAILABLE: " + count);

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
                Thread.sleep( 5 * 60 * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("SUCCESS!");
        }

    }
}