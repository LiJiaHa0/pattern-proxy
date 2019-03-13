package com.ljh.study.proxy.cglibproxy;

import com.ljh.study.proxy.Myself;

/**
 * @description: cglib动态代理测试类
 * @author: Jh Lee
 * @create: 2019-03-13 22:39
 **/
public class CglibSchoolmateTest {

    public static void main(String[] args) {
//        CglibSchoolmate cglibSchoolmate = new CglibSchoolmate();
        Myself myself = (Myself)new CglibSchoolmate().getInstance(Myself.class);
//        Object instance = cglibSchoolmate.getInstance(Myself.class);
//        Myself myself = (Myself)instance;
        myself.buyFood();
    }
}
