package com.eurekuserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekuserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekuserverApplication.class, args);
    }

}
