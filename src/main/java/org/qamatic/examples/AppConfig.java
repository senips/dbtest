package org.qamatic.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
    @Bean
    public Dummy getDummy() {
        return new Dummy();
    }
}
