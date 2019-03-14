package com.ljh.study.proxy.staticproxy;

import com.ljh.study.proxy.Myself;
import com.ljh.study.proxy.jdkproxy.Schoolmate;

/**
 * @description: 代理我自己的代理类
 * @author: Jh Lee
 * @create: 2019-03-14 19:54
 **/
public class MyselfProxy implements Schoolmate {

    private Myself myself;

    //通过构造参数把我们需要指定需要代理的类传进来
    public MyselfProxy(Myself myself) {
        this.myself = myself;
    }

    @Override
    public void buyFood() {
        before();
        //调用我们需要被代理的方法
        this.myself.buyFood();
        after();
    }

    @Override
    public void washClothes() {

    }

    public void before(){
        System.out.println("先买瓶水");
    }

    public void after(){
        System.out.println("再拿个快递");
    }
}
