package com.example.auth_service.infrastructure.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "jwt")
@Getter
@Setter
public class JwtProperties {
    private String secret;
    private String issuer = "betting-auth";
    private String audience = "betting-auth";
    private long accessTtlSeconds = 900;
    private long refreshTtlSeconds = 2_592_000;
}
