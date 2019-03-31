package com.cn.strategy.exp3;

import com.cn.delegate.t2.MemberController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 22:11
 */


public class DispatcherServlet extends HttpServlet{


    private List<Hander> handerList= new ArrayList<Hander>();


    public void init(){
        try {
        Class<?> clazz = MemberController.class;
            handerList.add(new Hander().setController(clazz.newInstance()).setMethod(clazz.getMethod("getMemberById",new Class[]{String.class})).setUrl("/test/getMemberById"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doDispacherServlet(req,resp);
    }


    public void doDispacherServlet(HttpServletRequest req, HttpServletResponse resp){


//1、获取用户请求的url
// 如果按照J2EE 的标准、每个url 对对应一个Serlvet，url 由浏览器输入
//2、Servlet 拿到url 以后，要做权衡（要做判断，要做选择）
// 根据用户请求的URL，去找到这个url 对应的某一个java 类的方法
//3、通过拿到的URL 去handlerMapping（我们把它认为是策略常量）
//4、将具体的任务分发给Method（通过反射去调用其对应的方法）

        String uri=req.getRequestURI();
        Hander hander =null;
        for(Hander hand:handerList){
            if(hand.getUrl().equals(uri)){
                hander=hand;
                break;
            }
        }
        Object obj=null;
        // Method method =hander.getMethod();
        try {
          obj  =hander.getMethod().invoke(hander.getController(),req.getParameter("mid"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
//5、获取到Method 执行的结果，通过Response 返回出去
// response.getWriter().write();



    class Hander{
        private Object controller;
        private Method method;
        private String url;


        public Object getController() {
            return controller;
        }

        public Hander setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Hander setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Hander setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
