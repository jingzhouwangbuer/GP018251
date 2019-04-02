package dynamicproxy.t1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-17 19:33
 */


public class OrderStaticProxy implements InvocationHandler {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private Object target;


    public Object getInstance(Object target){
         this.target=target;
         Class<?> clazz=target.getClass();
        //  clazz.getClassLoader()

         return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
     }
    public OrderStaticProxy() {
        this.target = new OrderServiceImpl();
    }

    public void before(Object proxy) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("前置加强");

        Long time = (Long)proxy.getClass().getMethod("getCreateTime").invoke(proxy);

        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据。");
        DynamicDataSourceEntry.set(dbRouter);
    }


    public void after(){
        System.out.println("后置加强");
    }

//public int createOrder(Order order)  对于被代理的对象 因为只是执行了createOrder方法
    //所以 参数是1.被代理对象 2.createOrder 3. order
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
       Object obejct=method.invoke(this.target,args);
        after();
       return obejct;
    }
}
