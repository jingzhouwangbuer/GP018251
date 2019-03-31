package com.cn.strategy.exp1.t1;

import com.cn.strategy.exp1.PromotionStrategy;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 17:11
 */


public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void doActivity(){
        promotionStrategy.doPromotion();
    }
}
