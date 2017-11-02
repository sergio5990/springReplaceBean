package com.example.demo.ok;

import com.example.demo.ATalker;
import com.example.demo.BTalker;
import com.example.demo.Talker;
import com.example.demo.ok.InjectByName2Test.ConstructorName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ConstructorName.class})
public class InjectByName2Test {
    @Autowired
    private ConstructorName constructorName;

    @Test
    public void test() {
        assertNotNull(constructorName);
    }

    @Configuration
    static class AConfig {
        @Bean
        Talker createBean() {
            return new ATalker();
        }
    }

    @Configuration
    static class BConfig{

        @Bean("customName")
        Talker createBean() {
            return new BTalker();
        }
    }

    @Configuration
    @Import({BConfig.class, AConfig.class})
    static class ConstructorName {
        public ConstructorName(Talker createBean, Talker customName) {
            assertEquals("A", createBean.sayName());
            assertEquals("B", customName.sayName());
        }
    }

}
