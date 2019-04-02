package dynamicproxy.t2.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-27 17:24
 */


public class JDKMeipo implements InvocationHandler{


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object= method.invoke(this.target,args);
        after();
       // System.out.println("object.getClass():"+object.getClass());
        return object;
    }


    private Object target;
    public Object getInstance(Object target)throws Exception{
        this.target=target;
        Class<?> clazz=target.getClass();
        System.out.println(clazz);
        System.out.println(clazz.getClassLoader());
        System.out.println(clazz.getInterfaces());
        System.out.println(this);

//        class dynamicproxy.Customer
//        sun.misc.Launcher$AppClassLoader@18b4aac2
//        [Ljava.lang.Class;@4554617c
//        dynamicproxy.JDKMeipo @74a14482

        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    private void before(){
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }
    private void after(){
        System.out.println("如果合适的话，就准备办事");
    }

}
