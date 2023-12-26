package com.lab13.task1;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class FacebookUser {
    private String email;
    private Country userCountry;
    private LocalDateTime userActiveTime;
}
