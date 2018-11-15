package com.didispace; /**
 * @Title: donghuaqiang.zh
 * @Description: TODO
 * @author HuaQiangD
 * @date 18-11-14 9:12
 */

import org.springframework.util.Assert;

/**
 * @author donghuaqiang.zh
 * @date 18-11-14 9:12
 */
public class AssertTest {

    public static void getNumber(int num){
        Assert.isTrue(num>0);
    }

    public static void main(String[] args){
        getNumber(-1);
    }
}
