package com.ljh.study.proxy.staticproxy;

import com.ljh.study.proxy.Myself;

/**
 * @description: 静态代理测试类
 * @author: Jh Lee
 * @create: 2019-03-14 20:17
 **/
public class MyselfProxyTest {

    public static void main(String[] args) {
        //实例化我们的代理类，然后把我自己通过构造参数传入代理类，对代理类里面的引用类型进行绑定
        MyselfProxy myselfProxyTest = new MyselfProxy(new Myself());
        //直接调用我们代理的方法，寓意就是直接让我们代理对象帮我去买饭
        myselfProxyTest.buyFood();
    }

}
