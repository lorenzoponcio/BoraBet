package com.example.auth_service.infrastructure.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .info(new Info()
                        .title("BoraBet - Auth Service")
                        .description("Documentação dos endpoints de autenticação, refresh e logout")
                        .version("v1"));
    }
}
