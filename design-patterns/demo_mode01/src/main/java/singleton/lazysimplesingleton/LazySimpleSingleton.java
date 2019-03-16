package singleton.lazysimplesingleton;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 10:02
 */


public class LazySimpleSingleton {


    private static LazySimpleSingleton singleton =null;

    public static LazySimpleSingleton getLazySimpleSingleton(){
        if(singleton==null){
            singleton =new LazySimpleSingleton();
        }
        return singleton;
    }
}
