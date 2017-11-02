package com.example.demo;

import com.example.demo.domain.Talker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CESuperAConfig extends AConf {
    @Override
    @Bean
    protected Talker createBean(){
        return super.createBean();
    }
}
