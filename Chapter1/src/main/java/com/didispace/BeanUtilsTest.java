package com.didispace; /**
 * @Title: donghuaqiang.zh
 * @Description: TODO
 * @author HuaQiangD
 * @date 18-11-14 9:12
 */

import org.springframework.beans.BeanUtils;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.SystemPropertyUtils;

import java.lang.reflect.Field;

/**
 * @author donghuaqiang.zh
 * @date 18-11-14 9:12
 */
public class BeanUtilsTest {

    static class User{
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }

    public static void main(String[] args){
        User user = new User();
        user.setAge(10);
        user.setName("xxx");
        
        User bean = null;
        BeanUtils.copyProperties(user,bean);

        //Constructor<User> constructorIfAvailable = ClassUtils.getConstructorIfAvailable(User.class);

        SystemPropertyUtils.resolvePlaceholders("");

       // FileCopyUtils.copyToString();
        Field name = ReflectionUtils.findField(User.class, "name");


    }
}
