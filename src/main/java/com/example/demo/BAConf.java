package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BConf.class, AConf.class})
public class BAConf {
}
