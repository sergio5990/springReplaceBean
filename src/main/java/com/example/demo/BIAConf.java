package com.example.demo;

import com.example.demo.domain.BName;
import com.example.demo.domain.Name;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AConf.class)
public class BIAConf {
    @Bean
    Name name(){
        return new BName();
    }
}
