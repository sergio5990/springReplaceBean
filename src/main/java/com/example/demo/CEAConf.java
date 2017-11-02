package com.example.demo;

import com.example.demo.domain.CName;
import com.example.demo.domain.Name;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CEAConf extends AConf{
    @Bean
    @Override
    Name name(){
        return new CName();
    }
}
