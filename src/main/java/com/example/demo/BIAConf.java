package com.example.demo;

import com.example.demo.domain.BTalker;
import com.example.demo.domain.Talker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AConf.class)
public class BIAConf {
    @Bean
    Talker createBean(){
        return new BTalker();
    }
}
