package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AConf.class, BConf.class})
public class ABConf {
}
