package com.example.demo.ok;

import com.example.demo.ATalker;
import com.example.demo.BTalker;
import com.example.demo.Talker;
import com.example.demo.ok.InjectByNameTest.AConfig;
import com.example.demo.ok.InjectByNameTest.BConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {AConfig.class, BConfig.class})
public class InjectByNameTest {
//    @Autowired not autowired
    private Talker talker;

    @Autowired
    private ApplicationContext context;

    @Autowired
    private Talker createBean;

    @Autowired
    private Talker customName;

    @Test
    public void test() {
        Map<String, Talker> beans = context.getBeansOfType(Talker.class);
        assertEquals(2, beans.size());
        assertNotNull(beans.get("createBean"));
        assertNotNull(beans.get("customName"));

        assertEquals("A", createBean.sayName());
        assertEquals("B", customName.sayName());

    }

    @Configuration
    static class AConfig{
        @Bean
        Talker createBean(){
            return new ATalker();
        }
    }

    @Configuration
    static class BConfig{
        @Bean
        Talker customName(){
            return new BTalker();
        }
    }

}
