package com.cn.strategy.exp2;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-21 20:21
 */


    public class PayState {
        private int code;
        private Object data;
        private String msg;
        public PayState(int code, String msg,Object data) {
            this.code = code;
            this.data = data;
            this.msg = msg;
        }

        public String toString(){
            return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data);
        }
    }

