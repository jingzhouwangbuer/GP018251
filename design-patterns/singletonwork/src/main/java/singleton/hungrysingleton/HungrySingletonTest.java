package singleton.hungrysingleton;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 9:56
 */


public class HungrySingletonTest {

    public static void main(String[] args) {
        HungrySingleton singleton = HungrySingleton.getSingleton();

        HungrySingleton singleton2 = HungrySingleton.getSingleton();

        System.out.println(singleton==singleton2);


    }
}
