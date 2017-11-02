package com.example.demo;

import com.example.demo.domain.AName;
import com.example.demo.domain.Name;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AConf {
    @Bean
    Name name(){
        return new AName();
    }
}
