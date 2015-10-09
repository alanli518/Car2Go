package com.alan;

/**
 * Created by alanli on 15-10-03.
 */
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CrunchifyJSONFileWrite {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        JSONObject obj = new JSONObject();
        obj.put("Name", "crunchify.com");
        obj.put("Author", "App Shah");

        JSONArray company = new JSONArray();
        company.add("Company: eBay");
        company.add("Company: Paypal");
        company.add("Company: Google");
        obj.put("Company List", company);

        FileWriter file = new FileWriter("/Users/alanli/Desktop/Car2Go/Output/file1.json");
        try {
            file.write(obj.toJSONString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            file.flush();
            file.close();
        }
    }
}
