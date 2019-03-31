package com.cn.strategy.exp1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 17:08
 */


public class GroupbuyStrategy implements PromotionStrategy{


    public void doPromotion() {
        System.out.println("采用团购的方式");
    }
}
