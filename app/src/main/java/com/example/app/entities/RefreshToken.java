package com.example.app.entities;


import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tokens")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String token;

    private Instant expiryDate;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "user_id", referencedColumnName = "user_id"
    )
    private UserInfo userInfo;
}
