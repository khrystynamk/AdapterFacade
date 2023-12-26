package com.lab13.task1;

import java.time.LocalDate;

public class MyTwitterUser implements User {
    private TwitterUser twitterUser;

    public MyTwitterUser (TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }
    @Override
    public String getEmail() {
        return twitterUser.getEmail();
    }

    @Override
    public Country getCountry() {
        return twitterUser.getUserCountry();
    }

    @Override
    public LocalDate getLastActiveDate() {
        return twitterUser.getUserActiveTime().toLocalDate();
    }
}