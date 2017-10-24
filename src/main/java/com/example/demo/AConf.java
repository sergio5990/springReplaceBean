package com.example.demo;

import com.example.demo.domain.AName;
import com.example.demo.domain.Name;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AConf {
    @Bean
    Name name(){
        return new AName();
    }
}
