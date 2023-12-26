package com.lab13.task3;

import org.json.JSONObject;

public interface Reader {
    public JSONObject fetchCompanyInfo(String website) throws Exception;
}