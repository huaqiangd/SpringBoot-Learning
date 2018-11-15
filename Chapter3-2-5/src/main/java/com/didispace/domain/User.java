package com.didispace.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/4/15 下午1:58.
 * @blog http://blog.didispace.com
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -1L;

    private String username;
    private Integer age;

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

}
