package com.example.demo;

import com.example.demo.domain.Name;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BConf.class, AConf.class})
@SpringBootTest
public class BATest {
	@Autowired
	private Name name;

	@Test
	public void contextLoads() {
		assertEquals("A", name.name());
	}

}
