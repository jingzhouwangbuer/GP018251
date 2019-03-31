package com.cn.strategy.exp1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 17:06
 */


public class CouponStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("采用优惠券抵扣的方式");

    }
}
