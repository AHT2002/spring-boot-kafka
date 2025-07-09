package com.example.kafka.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ConfigurationProperties(prefix = "kafka.cluster")
@Data
public class KafkaClusterConfiguration {
    String bootstrapServer;

    @PostConstruct
    public void validate() {
        if(bootstrapServer == null || bootstrapServer.isEmpty()) {
            throw new IllegalStateException("Kafka bootstrap server must be configured");
        }
    }
}
