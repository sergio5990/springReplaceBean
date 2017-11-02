package com.example.demo;

import com.example.demo.domain.CTalket;
import com.example.demo.domain.Talker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CEANotConfig extends ANotConfig {
    @Override
    @Bean
    protected Talker createBean(){
        return new CTalket();
    }
}
