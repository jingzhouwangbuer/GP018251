package com.cn.strategy.exp1.t3;

import com.cn.strategy.exp1.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 17:23
 */


public class StrategyFactory {

    private static Map<String,PromotionStrategy> map =new HashMap<String, PromotionStrategy>();
    private static final PromotionStrategy emptyStrategy =new EmptyStrategy();

    static {

        map.put(PromotionKey.COUPON,new CouponStrategy());
        map.put(PromotionKey.CASHBACK,new CashbackStrategy());
        map.put(PromotionKey.GROUPBUY,new GroupbuyStrategy());

    }

    private StrategyFactory(){

    }


    public static PromotionStrategy getStrategy(String key){
        PromotionStrategy strategy =map.get(key);
        return strategy==null?emptyStrategy:strategy;
    }

        private interface PromotionKey{
            String COUPON = "COUPON";
            String CASHBACK = "CASHBACK";
            String GROUPBUY = "GROUPBUY";
        }
}
