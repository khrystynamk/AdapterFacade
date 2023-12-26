package com.lab13.task1;

import java.time.LocalDate;

public class MyFacebookUser implements User {
    private FacebookUser facebookUser;

    public MyFacebookUser (FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }
    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public Country getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public LocalDate getLastActiveDate() {
        return facebookUser.getUserActiveTime().toLocalDate();
    }
}
