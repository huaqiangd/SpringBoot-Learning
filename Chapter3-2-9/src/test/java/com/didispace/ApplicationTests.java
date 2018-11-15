package com.didispace;

import com.didispace.service.TestUserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private TestUserService testUserService;

	@Before
	public void setUp() {
		// 准备，清空user表
		testUserService.deleteAllUsers();
	}

	@Test
	public void test() throws Exception {
		// 插入5个用户
		testUserService.create("a", 1);
		testUserService.create("b", 2);
		testUserService.create("c", 3);
		testUserService.create("d", 4);
		testUserService.create("e", 5);

		// 查数据库，应该有5个用户
		Assert.assertEquals(5, testUserService.getAllUsers().intValue());

		// 删除两个用户
		testUserService.deleteByUserName("a");
		testUserService.deleteByUserName("e");

		// 查数据库，应该有5个用户
		Assert.assertEquals(3, testUserService.getAllUsers().intValue());

	}


}
