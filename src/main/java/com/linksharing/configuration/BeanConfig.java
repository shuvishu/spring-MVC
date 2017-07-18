package com.linksharing.configuration;

import com.linksharing.repository.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {

    @Primary
    @Bean(name = "circle2")
    UserService abc() {
        return new UserService();
    }

    @Bean(name = "circle1")
    UserService dsfsd() {
        return new UserService();
    }
    /*
    <bean name="circle2" class="">

    <bean name="circle1" class="">
    */
}
