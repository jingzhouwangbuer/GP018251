package dynamicproxy.t3.gpproxy;

import dynamicproxy.t2.jdkproxy.Customer;
import staticproxy.t2.findlove.Person;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-04-01 22:11
 */


public class Test {

    public static void main(String[] args) {
        Person obj = (Person)new GPMeipo().getInstance(new Customer());
        System.out.println(obj.getClass());
        obj.findLove();
    }
}
