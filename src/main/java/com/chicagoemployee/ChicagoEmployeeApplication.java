package com.chicagoemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ChicagoEmployeeApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ChicagoEmployeeApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ChicagoEmployeeApplication.class, args);
    }

}

