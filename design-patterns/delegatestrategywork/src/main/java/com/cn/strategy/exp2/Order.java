package com.cn.strategy.exp2;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 20:38
 */


public class Order
{

    private String orderId;
    private String uid;
    private double price;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Order(String orderId, String uid, double price) {
        this.orderId = orderId;
        this.uid = uid;
        this.price = price;
    }

    public String pay(){
        return pay(PayStrategy.DefaultPay);
    }

    public String pay(String payKey){
        Payment payment=  PayStrategy.getPayment(payKey);
        System.out.println("支付方式"+payment.getName());
        System.out.println("您的余额"+payment.getBalance(uid));
        return payment.pay(uid,price).toString();
    }
}
