package com.example.demo;

import com.example.demo.domain.BName;
import com.example.demo.domain.Name;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BConf {
    @Bean
    Name name(){
        return new BName();
    }
}
