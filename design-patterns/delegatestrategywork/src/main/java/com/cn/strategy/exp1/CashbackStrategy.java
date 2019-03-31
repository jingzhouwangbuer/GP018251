package com.cn.strategy.exp1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 17:08
 */


public class CashbackStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("采用促销返现的方式");
    }
}
