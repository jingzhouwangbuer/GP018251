package com.cn.strategy.exp1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 17:09
 */


public class EmptyStrategy implements PromotionStrategy{

    public void doPromotion() {
        System.out.println("采用无优惠的方式");
    }
}
