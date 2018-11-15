package com.didispace.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/3/23 下午2:34.
 * @blog http://blog.didispace.com
 */
public interface TestUserRepository extends JpaRepository<TestUser, Integer> {

    TestUser findByUserName(String userName);

    TestUser findByUserNameAndAge(String userName, Integer age);

    @Query("from TestUser u where u.userName=:userName")
    TestUser findUser(@Param("userName") String userName);


}
