package com.SDET.SpringSelenium.Config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Faker getFakerObject(){
        return new Faker();
    }
}
