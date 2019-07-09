package com.zl.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zl.dao.TestUserMapper;
import com.zl.model.TestUser;



@Service
public class TestService {
	@Resource
	private TestUserMapper testUserMapper;
	
	public void insertTest() {
		TestUser user=TestUser.builder().name("user03").build();
		testUserMapper.insertSelective(user);
	}
}

