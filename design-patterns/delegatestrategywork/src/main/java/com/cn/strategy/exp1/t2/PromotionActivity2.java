package com.cn.strategy.exp1.t2;

import com.cn.strategy.exp1.CashbackStrategy;
import com.cn.strategy.exp1.CouponStrategy;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 17:11
 */


public class PromotionActivity2 {


    public void doActivity(String activity){

        if("cashback".equals(activity)){
            new CashbackStrategy().doPromotion();
        }else if("coupon".equals(activity)) {
            new CouponStrategy().doPromotion();
        }
        //.............等等 这样不利于维护
    }
}
