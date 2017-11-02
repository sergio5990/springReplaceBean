package com.example.demo;

import com.example.demo.domain.Talker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ABConf.class})
public class ABConfTest {
	@Autowired
	private Talker talker;

	@Test
	public void test() {
		assertEquals("B", talker.sayName());
	}

}
