package com.eurekuclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekuclient2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekuclient2Application.class, args);
    }

}
