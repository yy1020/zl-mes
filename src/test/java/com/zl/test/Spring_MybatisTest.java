package com.zl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zl.dao.TestUserMapper;
import com.zl.model.TestUser;

public class Spring_MybatisTest {
	private static ApplicationContext bean=new ClassPathXmlApplicationContext("spring\\applicationContext.xml");
	private TestUserMapper testUserMapper;
	
	@Test
	public void testMapper() {
		testUserMapper=bean.getBean(TestUserMapper.class);
		TestUser user=TestUser.builder().name("user01").build();
		testUserMapper.insertSelective(user);
	}
}
