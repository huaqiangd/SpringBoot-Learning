package com.didispace.domain;

import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Delete("delete from test_user")
    int deleteAll();

    @Select("SELECT id,user_name as userName,age FROM test_USER WHERE user_NAME = #{userName}")
    testUser findByName(@Param("userName") String userName);

    @Insert("INSERT INTO test_USER(user_NAME, AGE) VALUES(#{userName}, #{age})")
    int insert(@Param("userName") String userName, @Param("age") Integer age);

}