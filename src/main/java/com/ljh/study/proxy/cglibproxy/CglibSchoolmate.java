package com.ljh.study.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: cglib代理实现帮我买饭
 * @author: Jh Lee
 * @create: 2019-03-12 22:44
 **/
public class CglibSchoolmate implements MethodInterceptor {

    /**
     * 相当于jdk代理中的绑定
     * 通过构造器参数把我们需要代理的类传进来
     * 也可以通过声明一个代理属性，然后像JDK那样通过这个方法的参数进行赋值
     * @param clazz
     * @return
     */
    public Object getInstance(Class<?> clazz){

        //创建加强器，用来创建我们动态代理类
        Enhancer enhancer = new Enhancer();
        //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类)
        //因为我们cglib生成的代理是继承我们需要被代理的人，所以我们这里这是代理类的父类为我们被代理类
        enhancer.setSuperclass(clazz);
        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        enhancer.setCallback(this);
        return enhancer.create();
    }


    /**
     * 拦截方法，cglib通过这个方法帮我们执行我们所要代理的类的方法
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        //调用业务类（父类中）的方法
        Object invoke = methodProxy.invokeSuper(o, objects);
        after();
        return invoke;
    }

    private void before(){
        System.out.println("先买一瓶水");
    }

    private void after(){
        System.out.println("再拿个快递");
    }
}
