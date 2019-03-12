package com.ljh.study.proxy.jdkproxy;

import com.ljh.study.proxy.Myself;

/**
 * @description: JDK代理测试类
 * @author: Jh Lee
 * @create: 2019-03-12 22:16
 **/
public class JDKSchoolmateTest {

    public static void main(String[] args) {
        //我想买饭了，新建一个代理人帮我去买
        JDKSchoolmate jdkSchoolmate = new JDKSchoolmate();
        //代理人跟我绑定，相当于这个代理是我叫的，你现在只能帮我买
        Schoolmate schoolmate = (Schoolmate)jdkSchoolmate.bind(new Myself());
        //让代理帮我去买饭
        schoolmate.washClothes();

    }
}
