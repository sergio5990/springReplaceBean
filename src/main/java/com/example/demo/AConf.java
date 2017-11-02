package com.example.demo;

import com.example.demo.domain.ATalker;
import com.example.demo.domain.Talker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AConf {
    @Bean
    Talker createBean(){
        return new ATalker();
    }
}
