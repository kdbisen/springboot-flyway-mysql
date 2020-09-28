package com.example.demo;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class FlywaySlaveInitializer {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private CustomCallback customCallback;

    @Value("${instance:instance1}")
    private String instance;

    @Bean(initMethod = "migrate")
    public Flyway flyway() {
        return Flyway
                .configure()
                .dataSource(dataSource)
                .locations("classpath:db/migration/" + instance)
                .callbacks(customCallback)
                .cleanDisabled(true)
                .load();
    }
}