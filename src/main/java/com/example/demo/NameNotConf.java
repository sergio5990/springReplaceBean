package com.example.demo;

import com.example.demo.domain.Name;
import com.example.demo.domain.NameA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class NameNotConf {
    @Bean
    protected Name name(){
        return new NameA();
    }
}
