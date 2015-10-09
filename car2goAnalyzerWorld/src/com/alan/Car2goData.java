package com.alan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by alanli on 2015-10-03.
 */
public class Car2goData {

    public String getData (String city) {
        try {

            URL url = new URL("https://car2go.com/api/v2.1/vehicles?loc="+city+"&oauth_consumer_key=car2gowebsite&format=json");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String car2goData = "";
            String strTemp = "";
            while (null != (strTemp = br.readLine())) {
                car2goData += strTemp;
            }

            return car2goData;
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Error";
        }
    }
}