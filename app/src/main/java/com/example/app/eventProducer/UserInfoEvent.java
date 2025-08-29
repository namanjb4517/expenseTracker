package com.example.app.eventProducer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Getter
@Setter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfoEvent implements Serializable {
    private String firstName;

    private String lastName;

    private String email;

    private Long phoneNumber;

    private String userId;
}
