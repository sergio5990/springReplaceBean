package com.example.demo.ok;

import com.example.demo.ATalker;
import com.example.demo.BTalker;
import com.example.demo.Talker;
import com.example.demo.ok.ABTest.ABConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ABConfig.class)
public class ABTest {
	@Autowired
	private Talker talker;

	@Test
	public void test() {
		assertEquals("B", talker.sayName());
	}

	@Configuration
	@Import({AConfig.class, BConfig.class})
	static class ABConfig {

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
		Talker createBean(){
			return new BTalker();
		}
	}

}
