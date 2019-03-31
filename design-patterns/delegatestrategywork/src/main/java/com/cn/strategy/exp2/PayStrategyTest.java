package com.cn.strategy.exp2;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 20:48
 */


public class PayStrategyTest
{

    public static void main(String[] args) {
        Order order =new Order("001","uid1213",500);
        System.out.println(order.pay());

        Order order1 = new Order ("002","uid002012",3000);
        System.out.println(order1.pay("Ali"));
    }
}