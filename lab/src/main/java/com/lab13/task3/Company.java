package com.lab13.task3;

import lombok.Builder;
import lombok.Getter;

@Builder
public class Company {
    @Getter
    private String name;
    @Getter
    private String description;
    @Getter
    private String logo;

    public Company(String name, String description, String logo) {
        this.name = name;
        this.description = description;
        this.logo = logo;
    }
}