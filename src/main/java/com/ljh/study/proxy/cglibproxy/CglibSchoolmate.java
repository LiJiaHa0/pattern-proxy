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

//    public Object getInstance(Class<?> clazz){
//        Enhancer enhancer = new Enhancer();
//    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }
}
