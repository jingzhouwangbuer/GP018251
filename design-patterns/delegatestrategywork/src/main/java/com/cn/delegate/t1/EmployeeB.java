package com.cn.delegate.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-19 21:48
 */


public class EmployeeB implements IEmployee{
    public void doing(String command) {
        System.out.println("我是程序员B：我开始做"+command+"工作");
    }
}
