package es.local.chat.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class LocalChatUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocalChatUserServiceApplication.class, args);
    }

}
