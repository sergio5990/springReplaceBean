package com.example.demo;

import com.example.demo.domain.CName;
import com.example.demo.domain.Name;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class CEAConf extends AConf{
    @Bean
    @Override
    Name name(){
        return new CName();
    }
}
