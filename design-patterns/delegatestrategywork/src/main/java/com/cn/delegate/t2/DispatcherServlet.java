package com.cn.delegate.t2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-19 22:16
 */


public class DispatcherServlet  extends HttpServlet {


    public void doservice(HttpServletRequest req, HttpServletResponse res) {
        String uri=req.getRequestURI();
        //http://localhost:8080/test/delegateServlet/logout
        System.out.println(uri);
        String mid=req.getParameter("mid");

        if("/test/delegateServlet/member".equals(uri)){
             new MemberController().getMemberById(mid);
        }else if("/test/delegateServlet/order".equals(uri)){
              new MemberController().getMemberById(mid);
        }else if("/test/delegateServlet/logout".equals(uri)){
            new SysController().logout();
        }
        else {
            try{
                res.getWriter().write("404 Not Found!!");
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }



    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            doservice(req,res);
        } catch (ClassCastException var6) {
            throw new ServletException("non-HTTP request or response");
        }
    }
}
