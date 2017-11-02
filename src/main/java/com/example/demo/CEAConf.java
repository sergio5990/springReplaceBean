package com.example.demo;

import com.example.demo.domain.CTalket;
import com.example.demo.domain.Talker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CEAConf extends AConf{
    @Bean
    @Override
    Talker createBean(){
        return new CTalket();
    }
}
