package com.company;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String in = "{ \"index\": { \"_index\": \"car2go\", \"_type\": \"cars\" }}{\"smartPhoneRequired\":false,\"address\":\"Green P-74 Clinton St (UNDERGROUND)\",\"fuel\":87,\"exterior\":\"GOOD\",\"coordinates\":[-79.41418,43.6557,0],\"name\":\"BNYB065\",\"engineType\":\"CE\",\"vin\":\"WMEEJ3BA2CK570361\",\"time\":\"2015-10-04T11:26:38.543-0400\",\"interior\":\"GOOD\"}{ \"index\": { \"_index\": \"car2go\", \"_type\": \"cars\" }}{\"smartPhoneRequired\":false,\"address\":\"Green P-197 Blantyre Ave(no double parking)\",\"fuel\":87,\"exterior\":\"GOOD\",\"coordinates\":[-79.2815,43.68177,0],\"name\":\"BNYB163\",\"engineType\":\"CE\",\"vin\":\"WMEEJ3BA7CK568671\",\"time\":\"2015-10-04T11:26:38.543-0400\",\"interior\":\"GOOD\"}{ \"index\": { \"_index\": \"car2go\", \"_type\": \"cars\" }}{\"smartPhoneRequired\":false,\"address\":\"On street-18 Emily St(extra parking in garage)\",\"fuel\":100,\"exterior\":\"GOOD\",\"coordinates\":[-79.38511,43.64659,0],\"name\":\"BNYB210\",\"engineType\":\"CE\",\"vin\":\"WMEEJ3BA5CK575327\",\"time\":\"2015-10-04T11:26:38.543-0400\",\"interior\":\"GOOD\"}";

        Pattern p = Pattern.compile("\\[(.*?)\\]");
        Matcher m = p.matcher(in);

        String temp = "";

        while(m.find()) {
            temp += ",";
            temp += m.group(1);
        }

        double[] all = new double[9];
        double[] x = new double[3];
        double[] y = new double[3];
        int counter = 0;

        String delims = ",";
        StringTokenizer st = new StringTokenizer(temp, delims);
        while(st.hasMoreElements()){
            all[counter] = Double.parseDouble(st.nextElement().toString());
            counter++;
        }
        for(int i=0; i<all.length; i+=3){
            x[i/3]=all[i];
            System.out.println(x[i/3]);
            y[i/3]=all[i+1];
            System.out.println(y[i/3]);
        }
    }
}


