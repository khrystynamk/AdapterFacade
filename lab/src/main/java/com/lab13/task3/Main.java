package com.lab13.task3;

public class Main {
    public static void main(String[] args) {
        BrandfetchReader reader = new BrandfetchReader("Tv4ANE7Fawnh9v4R8aFuEKU/w2kjR2VM7+VIIGk+4gQ=");
        try {
            Company companyInfo = Facade.getCompanyInfo(reader, "github.com");
            System.out.println("Name: " + companyInfo.getName());
            System.out.println("Description: " + companyInfo.getDescription());
            System.out.println("Logo: " + companyInfo.getLogo());
        } catch (Exception e){
            System.out.println("Something went wrong: couldn't get info about the company." + e.toString());
        }
    }
}
