package com.company.project.config;

import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("RESTful API with Java 17 and Spring Boot 3")
                        .version("v1")
                        .description("Projeto com CRUD de pessoa")
                        .termsOfService("url")
                        .license(
                                new License()
                                        .name("Apache 2.0")
                                        .url("url")
                        )
                        .contact(new Contact()
                                .url("http://github.com/leandromelolm")
                                .name("Github - Leandro Melo"))
                );
    }

}

// http://localhost:8080/swagger-ui/index.html
// http://localhost:8080/v3/api-docs