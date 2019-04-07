package com.f.spring.admin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer

@EnableAdminServer
@SpringBootApplication
public class SpringAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAdminServerApplication.class, args);
    }

}
