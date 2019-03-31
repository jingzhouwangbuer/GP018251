package com.cn.delegate.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-19 21:54
 */


public class DelegateTest {


    public static void main(String[] args) {
            Boss boss =new Boss();
//            boss.creatwork("搭建服务器");
//
//
//            boss.creatwork("搭建系统");
//
//
//             boss.creatwork("算法");



           boss.creatwork("搭建服务器",new Leader());


            boss.creatwork("搭建系统",new Leader());


             boss.creatwork("算法",new Leader());

    }
}
