package com.mypackage.apigateway;

import com.mypackage.consumerservice.main.ConsumerServiceConfiguration;
import com.mypackage.orderservice.main.OrderServiceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@Import({ConsumerServiceConfiguration.class,
        OrderServiceConfiguration.class,
        })
public class ApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
    }
}
