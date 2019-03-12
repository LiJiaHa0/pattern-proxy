package com.ljh.study.proxy;

import com.ljh.study.proxy.jdkproxy.JDKSchoolmate;
import com.ljh.study.proxy.jdkproxy.Schoolmate;

/**
 * @description: 代理模式-我自己
 * @author: Jh Lee
 * @create: 2019-03-12 21:31
 **/
public class Myself implements Schoolmate {

    /**
     * 由于每一个同学都有一个要去买食物的动作，所以我们定义一个同学接口，接口中规定我们买饭的方法
     * 到我这里了，我突然有事，或者生病了，走不开，我们想要我们同学帮我们买饭这个操作，我们需要怎么做呢？
     * 新建一个代理类对象
     * @see JDKSchoolmate
     * 这个代理类就是代理我自己去买饭这一部操作。
     */
    @Override
    public void buyFood() {
        System.out.println("我自己不想去买食物，或者有事没时间，麻烦同学帮我买一点吃的。");
    }

    @Override
    public void washClothes() {
        System.out.println("你帮我洗衣服吧。");
    }
}
