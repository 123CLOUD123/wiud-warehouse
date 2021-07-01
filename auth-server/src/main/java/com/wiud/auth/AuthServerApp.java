package com.wiud.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class AuthServerApp {
    public static void main(String[] args) {
        SpringApplication.run(AuthServerApp.class, args);
    }
}
