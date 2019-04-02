package dynamicproxy.t3.gpproxy;

import java.lang.reflect.Method;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-04-01 21:48
 */


public class GPMeipo implements GPInvocationHandler{

    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        //注意这里一定是引用对象
        method.invoke(this.target,args);

        after();
        return null;
    }


    public Object getInstance(Object target){
        this.target=target;
        Class<?> clazz =target.getClass();

        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    private void before(){
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }
    private void after(){
        System.out.println("如果合适的话，就准备办事");
    }
}
