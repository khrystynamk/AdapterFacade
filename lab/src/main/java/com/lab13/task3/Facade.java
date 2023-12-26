package com.lab13.task3;

import org.json.JSONObject;

public class Facade {
    public static Company getCompanyInfo(Reader reader, String website) throws Exception {
        JSONObject jsonObject = reader.fetchCompanyInfo(website);
        String name = jsonObject.optString("name");
        String description = jsonObject.optString("description");
        String logo = jsonObject.optString("logos");
        return Company.builder()
                    .name(name)
                    .description(description)
                    .logo(logo)
                    .build();
    }
}