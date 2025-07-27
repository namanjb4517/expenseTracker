package com.example.app.model;

import com.example.app.entities.UserInfo;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;


@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UserInfoDto extends UserInfo {

    private String firstName;

    private String lastName; //last_name

    private Long phoneNumber;

    private String email;
}
