package com.cn.strategy.exp2;

import java.util.HashMap;
import java.util.Map;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 20:30
 */


public class PayStrategy {

    private static final String JdPay="Jd";
    private static final String AliPay="Ali";
    private static final String WeChatPay="WeChat";
    public static final String DefaultPay=JdPay;

    private static Map<String,Payment> map =new HashMap<String,Payment>();

    static {
        map.put(JdPay,new JdPay());
        map.put(AliPay,new AliPay());
        map.put(WeChatPay,new WeCatPay());

    }
    private PayStrategy(){

    }
    public static Payment getPayment(String payKey){

        if(map.containsKey(payKey)){
            return  map.get(payKey);
        }
        return map.get(DefaultPay);
    }
}
