package dynamicproxy.t3.gpproxy;

import java.lang.reflect.Method;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-04-01 21:47
 */


public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
