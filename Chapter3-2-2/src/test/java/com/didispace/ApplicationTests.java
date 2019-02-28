package com.didispace;

import com.didispace.domain.TestUser;
import com.didispace.domain.TestUserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {

    @Autowired
    private TestUserRepository testUserRepository;

    @Test
    public void test() throws Exception {

        testUserRepository.deleteAll();

        // 创建10条记录
        testUserRepository.save(new TestUser("AAA", 10));
        testUserRepository.save(new TestUser("BBB", 20));
        testUserRepository.save(new TestUser("CCC", 30));
        testUserRepository.save(new TestUser("DDD", 40));
        testUserRepository.save(new TestUser("EEE", 50));
        testUserRepository.save(new TestUser("FFF", 60));
        testUserRepository.save(new TestUser("GGG", 70));
        testUserRepository.save(new TestUser("HHH", 80));
        testUserRepository.save(new TestUser("III", 90));
        testUserRepository.save(new TestUser("JJJ", 100));

        // 测试findAll, 查询所有记录
        //Assert.assertEquals(10, testUserRepository.findAll().size());

        // 测试findByName, 查询姓名为FFF的User
        //Assert.assertEquals(60, testUserRepository.findByUserName("FFF").getAge().intValue());

        // 测试findUser, 查询姓名为FFF的User
        Assert.assertEquals(60, testUserRepository.findUser("FFF").getAge().intValue());
//
//		// 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
//		Assert.assertEquals("FFF", testUserRepository.findByUserNameAndAge("FFF", 60).getUserName());
//
//		// 测试删除姓名为AAA的User
//		testUserRepository.delete(testUserRepository.findByUserName("AAA"));
//
//		// 测试findAll, 查询所有记录, 验证上面的删除是否成功
//		Assert.assertEquals(9, testUserRepository.findAll().size());

    }


}
