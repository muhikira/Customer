package com.muhikira.customer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "List of API", version = "1.0", description = "All the APIs Information"))
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run (CustomerApplication.class, args);
    }

}
