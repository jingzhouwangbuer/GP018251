package dynamicproxy.t2.jdkproxy;

import staticproxy.t2.findlove.Person;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-27 17:54
 */


public class Customer implements Person {
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("胸大，6 块腹肌");
    }
}
