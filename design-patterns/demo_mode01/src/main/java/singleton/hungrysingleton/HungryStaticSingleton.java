package singleton.hungrysingleton;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 9:54
 */


public class HungryStaticSingleton {
    private static HungryStaticSingleton singleton ;



    static {
        singleton =new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){

    }

     public static HungryStaticSingleton getSingleton(){
        return  singleton;
     }

}
