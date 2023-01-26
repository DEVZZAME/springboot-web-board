package com.hansol.webboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringbootWebBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebBoardApplication.class, args);
    }

}
