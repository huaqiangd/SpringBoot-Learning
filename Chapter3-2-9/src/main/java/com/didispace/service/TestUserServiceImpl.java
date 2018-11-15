package com.didispace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/3/17 下午6:44.
 * @blog http://blog.didispace.com
 */
@Service
public class TestUserServiceImpl implements TestUserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String userName, Integer age) {
        jdbcTemplate.update("insert into test_user(user_NAME, AGE) values(?, ?)", userName, age);
    }

    @Override
    public void deleteByUserName(String userName) {
        jdbcTemplate.update("delete from test_user where user_NAME = ?", userName);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from test_user", Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("delete from test_user");
    }
}
