package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.kafka.annotation.EnableKafka;


@EnableConfigurationProperties
@SpringBootApplication
@EnableKafka
public class SpringBootKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKafkaApplication.class, args);
    }

}
