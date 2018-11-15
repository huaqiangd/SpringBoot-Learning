package com.didispace.domain;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestUserMapper {

    @Select("SELECT id,user_name as userName,age FROM test_user WHERE user_name = #{userName}")
    TestUser findByName(@Param("userName") String userName);

    @Results({
            @Result(property = "userName", column = "user_name"),
            @Result(property = "age", column = "age")
    })
    @Select("SELECT user_name, age FROM test_user")
    List<TestUser> findAll();

    @Insert("INSERT INTO test_user(user_name, age) VALUES(#{userName}, #{age})")
    int insert(@Param("userName") String userName, @Param("age") Integer age);

    @Update("UPDATE test_user SET age=#{age} WHERE user_name=#{userName}")
    void update(TestUser testUser);

    @Delete("DELETE FROM test_user WHERE id =#{id}")
    void delete(Long id);

    @Insert("INSERT INTO test_user(user_name, age) VALUES(#{userName}, #{age})")
    int insertByUser(TestUser testUser);

    @Insert("INSERT INTO test_user(user_name, age) VALUES(#{userName,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})")
    int insertByMap(Map<String, Object> map);

    @Delete("delete from test_user")
    int deleteAll();
}