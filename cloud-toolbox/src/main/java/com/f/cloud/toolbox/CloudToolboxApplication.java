package com.f.cloud.toolbox;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class CloudToolboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudToolboxApplication.class, args);
    }

    @Value("${toolbox.version}")
    private String version;

    @GetMapping
    public String index() {
        return "嗨" + version;
    }

}
