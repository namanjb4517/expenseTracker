package com.example.app.model;

import com.example.app.entities.UserInfo;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserInfoDto extends UserInfo {

    private String firstName;

    private String lastName; //last_name

    private Long phoneNumber;

    private String email;
}
