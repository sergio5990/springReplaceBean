package com.example.demo;

import com.example.demo.domain.BName;
import com.example.demo.domain.Name;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class BConf {
    @Bean
    Name name(){
        return new BName();
    }
}
