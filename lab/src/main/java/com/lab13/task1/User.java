package com.lab13.task1;

import java.time.LocalDate;

public interface User {
    public String getEmail();
    public Country getCountry();
    public LocalDate getLastActiveDate();
}
