package com.didispace.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/4/27 下午10:04.
 * @blog http://blog.didispace.com
 */
@Data
public class User {

    @Id
    private Long id;

    private String username;
    private Integer age;

    public User(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }
}
