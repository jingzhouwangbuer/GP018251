package com.cn.delegate.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-19 21:53
 */


public class Boss {

//    private Leader leader;
//    public void creatwork(String command){
//        System.out.println("Boss 开始指挥任务"+command);
//        leader.doing(command);
//    }


        public void creatwork(String command,Leader leader){
        System.out.println("Boss 开始指挥任务"+command);
        leader.doing(command);
    }

//    public Boss() {
//        leader =new Leader();
//    }
}
