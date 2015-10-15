package com.alan;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by alanli on 2015-10-06.
 *
 * This program takes a JSON input as a string and extracts the GPS
 * coordinates using regex and then returns the coordinates as an ArrayList.
 *
 * Coordinates look like [longitude, latitude, 0].
 */
public class JSONtoArray {

    private String temp;
    private Pattern p;
    private Matcher m;
    private String delims;
    private StringTokenizer st;
    private ArrayList cars;

    public JSONtoArray() {
    }

    public ArrayList getCoordinates(String input){
        this.temp = "";
        this.p = Pattern.compile("\\[(.*?)\\]");
        this.m = p.matcher(input);
        this.delims = ",";
        while(m.find()) {
            temp += ",";
            temp += m.group(1);
        }
        st = new StringTokenizer(temp, delims);
        this.cars = new ArrayList();
        while(st.hasMoreElements()){
            cars.add(Double.parseDouble(st.nextElement().toString()));
        }
        return cars;
    }
}
