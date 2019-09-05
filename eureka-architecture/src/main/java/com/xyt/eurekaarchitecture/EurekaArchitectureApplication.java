package com.xyt.eurekaarchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaArchitectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaArchitectureApplication.class, args);
    }

}
