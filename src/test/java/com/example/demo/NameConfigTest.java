package com.example.demo;

import com.example.demo.domain.Name;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {NameCNameNotEANotConfig.class})
public class NameConfigTest {
    @Autowired
    private ApplicationContext context;

    @Test
    public void test() {
        Map<String, Name> beans = context.getBeansOfType(Name.class);
        assertEquals(2, beans.size());

        assertNotNull(beans.get("custom-name"));
        assertNotNull(beans.get("name"));
    }
}