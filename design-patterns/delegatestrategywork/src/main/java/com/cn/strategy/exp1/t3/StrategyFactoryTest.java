package com.cn.strategy.exp1.t3;

import com.cn.strategy.exp1.t1.PromotionActivity;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 17:39
 */


public class StrategyFactoryTest {

    public static void main(String[] args) {
        PromotionActivity activity =new PromotionActivity(StrategyFactory.getStrategy(""));
        activity.doActivity();



        PromotionActivity activity1 =new PromotionActivity(StrategyFactory.getStrategy("COUPON"));
        activity1.doActivity();
    }
}
