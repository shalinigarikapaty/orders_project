package com.mypackage.consumerservice.web;

import com.mypackage.consumerservice.domain.ConsumerConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(ConsumerConfiguration.class)
public class ConsumerWebConfiguration {
}
