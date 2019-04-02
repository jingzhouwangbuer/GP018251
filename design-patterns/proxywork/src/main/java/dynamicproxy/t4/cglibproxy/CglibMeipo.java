package dynamicproxy.t4.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-04-02 22:06
 */


public class CglibMeipo implements MethodInterceptor {


    public  Object  getInstance(Class<?> clazz){

        Enhancer enhancer =new Enhancer();

        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        return enhancer.create();

    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();

        methodProxy.invokeSuper(o,objects);

        after();
        return null;

    }

    private void before(){
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }
    private void after(){
        System.out.println("如果合适的话，就准备办事");
    }

}
