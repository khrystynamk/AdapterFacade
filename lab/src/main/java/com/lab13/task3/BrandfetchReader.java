package com.lab13.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class BrandfetchReader implements Reader {
    private String apiKey;

    public BrandfetchReader(String apiKey) {
        this.apiKey = apiKey;
    }

    public JSONObject fetchCompanyInfo(String website) throws Exception {
        String apiUrl = "https://api.brandfetch.io/v2/brands/" + website;
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", "Bearer " + this.apiKey);
        connection.setRequestProperty("accept", "application/json");
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        JSONObject jsonObject = new JSONObject(text);

        return jsonObject;
    }
}
