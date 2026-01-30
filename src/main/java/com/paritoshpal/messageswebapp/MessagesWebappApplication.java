package com.paritoshpal.messageswebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class MessagesWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessagesWebappApplication.class, args);
    }

}
