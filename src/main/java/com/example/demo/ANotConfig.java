package com.example.demo;

import com.example.demo.domain.ATalker;
import com.example.demo.domain.Talker;
import org.springframework.context.annotation.Bean;

public class ANotConfig {
    @Bean
    Talker createBean(){
        return new ATalker();
    }
}
