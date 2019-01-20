package com.dietcontroller.dietcontrollerweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.dietcontroller.dietcontrollerweb.service")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DietcontrollerwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DietcontrollerwebApplication.class, args);
    }

}

