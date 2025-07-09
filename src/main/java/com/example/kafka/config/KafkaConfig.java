package com.example.kafka.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Configuration
//@ConfigurationProperties(prefix = "kafka")
public class KafkaConfig {

    @Autowired
    KafkaClusterConfiguration clusterConfiguration;

    @Bean
    public KafkaAdmin admin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, clusterConfiguration.getBootstrapServer());
        return new KafkaAdmin(configs);
    }
}
