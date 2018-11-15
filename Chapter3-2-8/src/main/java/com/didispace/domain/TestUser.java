package com.didispace.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestUser {

    private Long id;
    private String userName;
    private Integer age;

    public TestUser(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

}
