package com.didispace;

import com.didispace.domain.testUser;
import com.didispace.domain.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
public class ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	@Rollback
	public void findByName() throws Exception {

		userMapper.deleteAll();
		userMapper.insert("AAA", 20);
		testUser u = userMapper.findByName("AAA");
		System.out.println(u);
		Assert.assertEquals(20, u.getAge().intValue());
	}

}