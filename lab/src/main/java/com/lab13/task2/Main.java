package com.lab13.task2;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization authorization = new Authorization();
        if (authorization.authorize(db)) {
            ReportBuilder rb = new ReportBuilder(db);
        }
    }
}
