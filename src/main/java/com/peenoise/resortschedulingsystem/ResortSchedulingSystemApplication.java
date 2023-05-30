package com.peenoise.resortschedulingsystem;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Resort Scheduling System API Documentation",
                description = "Peenoise Resort Scheduling System",
                version = "v1.0"
        )

)
public class ResortSchedulingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResortSchedulingSystemApplication.class, args);
    }


}
