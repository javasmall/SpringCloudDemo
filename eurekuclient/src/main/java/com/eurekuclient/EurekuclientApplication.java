package com.eurekuclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekuclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekuclientApplication.class, args);
    }

}
