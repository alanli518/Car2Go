package com.alan;


public class CrunchifyFetchURLData {

    public static void main(String[] args) {

        System.out.println(new Car2goData().getData());
//        try {
//
//            URL url = new URL("https://car2go.com/api/v2.1/vehicles?loc=toronto&oauth_consumer_key=car2gowebsite&format=json");
//            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
//            String Car2goData = "";
//            String strTemp = "";
//            while (null != (strTemp = br.readLine())) {
//                Car2goData += strTemp;
//            }
//            System.out.println(Car2goData);
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }
}