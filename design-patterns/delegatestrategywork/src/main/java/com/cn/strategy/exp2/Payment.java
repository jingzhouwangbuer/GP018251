package com.cn.strategy.exp2;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 20:19
 */


public abstract class Payment {

    public abstract String getName();

    public abstract double getBalance(String uid);

    public PayState pay(String uid,double price){

        if(getBalance(uid)>price){
            return new PayState(0,"支付成功","支付金额为"+price);
        }
        return new PayState(1,"交易失败","余额不足");
    }
}
