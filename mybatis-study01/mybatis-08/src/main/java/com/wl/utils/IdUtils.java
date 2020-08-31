package com.wl.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @Author: weilong
 * @Date: 2020/6/9 21:13
 */
public class IdUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(IdUtils.getId());
    }
}
