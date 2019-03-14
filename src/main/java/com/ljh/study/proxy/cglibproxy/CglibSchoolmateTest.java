package com.ljh.study.proxy.cglibproxy;

import com.ljh.study.proxy.Myself;

/**
 * @description: cglib动态代理测试类
 * @author: Jh Lee
 * @create: 2019-03-13 22:39
 **/
public class CglibSchoolmateTest {

    public static void main(String[] args) {
        //通过我们的代理类getInstance方法生成我们代理类对象，然后我们强转为我自己，实际这个Myself类为cglib为我们自动生成的
        Myself myself = (Myself)new CglibSchoolmate().getInstance(Myself.class);
        //通过调用buyFood方法实现我们代理类的中方法，
        myself.buyFood();
    }
}
