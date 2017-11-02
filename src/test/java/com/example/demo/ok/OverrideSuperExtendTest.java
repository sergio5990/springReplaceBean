package com.example.demo.ok;

import com.example.demo.ATalker;
import com.example.demo.Talker;
import com.example.demo.ok.OverrideSuperExtendTest.BSuperExtendsAConfig;
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

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BSuperExtendsAConfig.class})
public class OverrideSuperExtendTest {
	@Autowired
	private Talker talker;
	@Autowired
	private ApplicationContext context;

	@Test
	public void test() {
		assertEquals("A", talker.sayName());

		Map<String, Talker> beans = context.getBeansOfType(Talker.class);
		assertEquals(1, beans.size());
	}

	@Configuration
	static class AConfig{
		@Bean
		Talker createBean(){
			return new ATalker();
		}
	}

	@Configuration
	static class BSuperExtendsAConfig extends AConfig{
		@Bean
		Talker createBean(){
			return super.createBean();
		}
	}

}
