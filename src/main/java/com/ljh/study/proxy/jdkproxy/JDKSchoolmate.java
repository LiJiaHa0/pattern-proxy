package com.ljh.study.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 代理对象，我们暂且称之为同学，同学帮我们买饭，用于代理我自己去买饭的操作
 * @author: Jh Lee
 * @create: 2019-03-12 21:48
 **/
public class JDKSchoolmate implements InvocationHandler {

    //这个属性就是我们被代理的对象，我们这个代理同学不止帮我自己买饭，还可以帮我们其他同学买饭，所以我们定义属性为Object，用于不同的同学对象
    private Object proxyObject;

    /**
     * 对我们代理对象的一个绑定，以及返回一个我们JDK自动通过反射生成的一个代理类（$proxy0）
     * 在这个方法里面生成一个代理类。
     * 当我想找人买饭时，我就可以通过这个对象的这个方法返回一个代理类，让这个代理类帮我实现。
     * @param proxyObject
     * @return
     */
    public Object bind(Object proxyObject){
        //接口业务实现类传过来的参数（就是我们需要帮助哪一个同学买饭，进行我们的代理对象绑定）
        this.proxyObject = proxyObject;

        //通过我们被代理类的类加载器，代理类class，以及我们实现了InvocationHandler这个接口的本身参数，JDK通过反射机制，帮我们生成一个代理类并返回。
        Object o = Proxy.newProxyInstance(proxyObject.getClass().getClassLoader(), proxyObject.getClass().getInterfaces(), this);
        return o;
    }

    /**
     * 这个方法才是我们调用被代理类所要代理的方法，当然我们，在这里使用这个方法之前，我们可以做一些其他事。
     * 例如：叫同学帮我买饭之前，先帮我买一瓶水，买完饭之后回来的路上，再帮我去拿个快递。
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        //这里是我们代理所真要执行的代理方法
        Object invoke = method.invoke(proxyObject, args);
        this.after();
        return invoke;
    }

    public void before(){
        System.out.println("先帮我买一瓶水！");
    }

    public void after(){
        System.out.println("回来再拿个快递！");
    }
}
