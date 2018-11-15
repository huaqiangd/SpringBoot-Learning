package com.didispace;

import com.didispace.domain.TestUser;
import com.didispace.domain.TestUserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
public class ApplicationTests {

	@Autowired
	private TestUserMapper userMapper;

	@Test
	@Rollback
	public void testUserMapper() throws Exception {
		userMapper.deleteAll();

		// insert一条数据，并select出来验证
		userMapper.insert("AAA", 20);
		TestUser u = userMapper.findByName("AAA");
		Assert.assertEquals(20, u.getAge().intValue());
		// update一条数据，并select出来验证
		u.setAge(30);
		userMapper.update(u);
		u = userMapper.findByName("AAA");
		Assert.assertEquals(30, u.getAge().intValue());
		// 删除这条数据，并select验证
		userMapper.delete(u.getId());
		u = userMapper.findByName("AAA");
		Assert.assertEquals(null, u);

		u = new TestUser("BBB", 30);
		userMapper.insertByUser(u);
		Assert.assertEquals(30, userMapper.findByName("BBB").getAge().intValue());

		Map<String, Object> map = new HashMap<>();
		map.put("userName", "CCC");
		map.put("age", 40);
		userMapper.insertByMap(map);
		Assert.assertEquals(40, userMapper.findByName("CCC").getAge().intValue());

		List<TestUser> userList = userMapper.findAll();
		for(TestUser user : userList) {
			Assert.assertEquals(null, user.getId());
			Assert.assertNotEquals(null, user.getUserName());
		}

	}

}
