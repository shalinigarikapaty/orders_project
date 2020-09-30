package com.mypackage.consumerservice.main;


import com.mypackage.commomswagger.CommonSwaggerConfiguration;
import com.mypackage.consumerservice.web.ConsumerWebConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@EnableEurekaClient
@EnableDiscoveryClient
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EntityScan
@Import({ConsumerWebConfiguration.class, CommonSwaggerConfiguration.class})
public class ConsumerServiceConfiguration {
}
