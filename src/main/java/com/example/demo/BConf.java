package com.example.demo;

import com.example.demo.domain.BTalker;
import com.example.demo.domain.Talker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BConf {
    @Bean
    Talker createBean(){
        return new BTalker();
    }
}
