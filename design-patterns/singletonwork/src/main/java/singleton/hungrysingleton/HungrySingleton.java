package singleton.hungrysingleton;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 9:54
 */


public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){

    }

     public static HungrySingleton getSingleton(){
        return  singleton;
     }

}
