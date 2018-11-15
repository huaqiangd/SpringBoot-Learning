package com.didispace.service;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/3/17 下午7:04.
 * @blog http://blog.didispace.com
 */
public interface TestUserService {

    /**
     * 新增一个用户
     * @param userName
     * @param age
     */
    void create(String userName, Integer age);

    /**
     * 根据name删除一个用户
     * @param userName
     */
    void deleteByUserName(String userName);

    /**
     * 获取用户总量
     */
    Integer getAllUsers();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();


}
