package com.example.demo;

import com.example.demo.domain.Name;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CEAProtConf extends AProtConf{
    @Override
    @Bean("custom-name")
    protected Name name(){
        return super.name();
    }
}
