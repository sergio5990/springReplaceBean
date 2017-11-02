package com.example.demo.ok;

import com.example.demo.ATalker;
import com.example.demo.Talker;
import com.example.demo.ok.SingleBeanTest.SingleBeanConf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SingleBeanConf.class)
public class SingleBeanTest {
    @Autowired
    private Talker talker;

    @Test
    public void test() {
        assertEquals("A", talker.sayName());
    }

    static class SingleBeanConf {
        @Bean
        Talker createBean() {
            return new ATalker();
        }
    }
}