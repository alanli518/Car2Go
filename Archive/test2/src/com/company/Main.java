package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        String in = "{ \"index\": { \"_index\": \"car2go\", \"_type\": \"cars\" }}{\"smartPhoneRequired\":false,\"address\":\"Green P-74 Clinton St (UNDERGROUND)\",\"fuel\":87,\"exterior\":\"GOOD\",\"coordinates\":[-79.41418,43.6557,0],\"name\":\"BNYB065\",\"engineType\":\"CE\",\"vin\":\"WMEEJ3BA2CK570361\",\"time\":\"2015-10-04T11:26:38.543-0400\",\"interior\":\"GOOD\"}{ \"index\": { \"_index\": \"car2go\", \"_type\": \"cars\" }}{\"smartPhoneRequired\":false,\"address\":\"Green P-197 Blantyre Ave(no double parking)\",\"fuel\":87,\"exterior\":\"GOOD\",\"coordinates\":[-79.2815,43.68177,0],\"name\":\"BNYB163\",\"engineType\":\"CE\",\"vin\":\"WMEEJ3BA7CK568671\",\"time\":\"2015-10-04T11:26:38.543-0400\",\"interior\":\"GOOD\"}{ \"index\": { \"_index\": \"car2go\", \"_type\": \"cars\" }}{\"smartPhoneRequired\":false,\"address\":\"On street-18 Emily St(extra parking in garage)\",\"fuel\":100,\"exterior\":\"GOOD\",\"coordinates\":[-79.38511,43.64659,0],\"name\":\"BNYB210\",\"engineType\":\"CE\",\"vin\":\"WMEEJ3BA5CK575327\",\"time\":\"2015-10-04T11:26:38.543-0400\",\"interior\":\"GOOD\"}";
        ArrayList out = new ArrayList();
        JSONtoArray JtoA = new JSONtoArray();
        out = JtoA.getCoordinates(in);
        Iterator it = out.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
