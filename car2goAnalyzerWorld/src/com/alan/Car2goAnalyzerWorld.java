package com.alan;

/**
 * Created by alanli on 15-10-03.
 *
 * This program takes a 1-time snapshot of all available Car2Go's from around the world.
 * Date from each city is cleansed (added ES header, city name, country name, timestamp)
 * and saved separately in a JSON file.
 */

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Car2goAnalyzerWorld {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        String[] cities = new String[24];
        String[] countries = new String[24];
        cities[0] = "wien";
        cities[1] = "calgary";
        cities[2] = "montreal";
        cities[3] = "toronto";
        cities[4] = "vancouver";
        cities[5] = "kobenhavn";
        cities[6] = "berlin";
        cities[7] = "frankfurt";
        cities[8] = "hamburg";
        cities[9] = "stuttgart";
        cities[10] = "firenze";
        cities[11] = "milano";
        cities[12] = "roma";
        cities[13] = "amsterdam";
        cities[14] = "stockholm";
        cities[15] = "austin";
        cities[16] = "columbus";
        cities[17] = "denver";
        cities[18] = "miami";
        cities[19] = "minneapolis";
        cities[20] = "newyorkcity";
        cities[21] = "portland";
        cities[22] = "sandiego";
        cities[23] = "seattle";

        countries[0] = "austria";
        countries[1] = "canada";
        countries[2] = "canada";
        countries[3] = "canada";
        countries[4] = "canada";
        countries[5] = "denmark";
        countries[6] = "germany";
        countries[7] = "germany";
        countries[8] = "germany";
        countries[9] = "germany";
        countries[10] = "italy";
        countries[11] = "italy";
        countries[12] = "italy";
        countries[13] = "netherlands";
        countries[14] = "sweden";
        countries[15] = "us";
        countries[16] = "us";
        countries[17] = "us";
        countries[18] = "us";
        countries[19] = "us";
        countries[20] = "us";
        countries[21] = "us";
        countries[22] = "us";
        countries[23] = "us";

        Car2goData car2goData = new Car2goData();
        String strCar2go;
        CurrentTime curTime = new CurrentTime();
        JSONParser parser = new JSONParser();
        String currentTime;

        try {
            currentTime = curTime.getCurTime();
            for(int i = 0; i<cities.length; i++) {
                FileWriter file = new FileWriter("/Users/alanli/Desktop/"+cities[i]+currentTime+".json");
                strCar2go = car2goData.getData(cities[i]);
                Object obj = parser.parse(strCar2go);

                JSONObject jsonObject = (JSONObject) obj;
                JSONArray placemarks = (JSONArray) jsonObject.get("placemarks");

                int count = placemarks.size();
                System.out.println("NUMBER OF CARS AVAILABLE IN "+cities[i]+" : " + count);

                for (int j = 0; j < count; j++) {
                    JSONObject car = (JSONObject) placemarks.get(j);
                    //----------------------ADD timestamp HERE---------------
                    car.put("time", currentTime);
                    //----------------------ADD city HERE---------------
                    car.put("city", cities[i]);
                    //----------------------ADD country HERE---------------
                    car.put("country", countries[i]);
                    //----------------------INSERT indexHEADER HERE----------
                    file.write("{ \"index\": { \"_index\": \"car2goworld\", \"_type\": \"cars\" }}\n");
                    file.write(car.toJSONString());
                    file.write("\n");
                    //-------------------------------------------------------
                }
                file.flush();
                file.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("SUCCESS!");
        }

    }
}