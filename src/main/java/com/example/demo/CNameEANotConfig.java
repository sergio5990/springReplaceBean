package com.example.demo;

import com.example.demo.domain.Talker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CNameEANotConfig extends ANotConfig {
    @Override
    @Bean("custom-name")
    protected Talker createBean(){
        return super.createBean();
    }
}
