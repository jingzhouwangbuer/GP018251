package com.cn.strategy.exp2;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 20:27
 */


public class AliPay extends Payment {
    public String getName() {
        return "支付宝支付";
    }

    public double getBalance(String uid) {
        System.out.println("您的账户"+uid);
        return 300;
    }
}
