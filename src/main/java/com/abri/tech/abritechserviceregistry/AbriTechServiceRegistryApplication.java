package com.abri.tech.abritechserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AbriTechServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbriTechServiceRegistryApplication.class, args);
    }

}
