package com.mypackage.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerRegistrationApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerRegistrationApplication.class, args);
    }
}
