package com.cn.strategy.exp1.t1;

import com.cn.strategy.exp1.CashbackStrategy;
import com.cn.strategy.exp1.EmptyStrategy;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 17:12
 */


public class PromotionStrategyTest
{


    public static void main(String[] args) {
        PromotionActivity activity = new PromotionActivity(new CashbackStrategy());
        activity.doActivity();


        PromotionActivity activity1 = new PromotionActivity(new EmptyStrategy());

        activity1.doActivity();
    }
}
