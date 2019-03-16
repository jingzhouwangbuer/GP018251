package singleton.lazysimplesingleton;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 10:02
 */


public class LazySynchronizedSingleton {


    private static LazySynchronizedSingleton singleton =null;

    public synchronized static LazySynchronizedSingleton getLazySimpleSingleton(){
         if(singleton==null){
            singleton =new LazySynchronizedSingleton();
        }
        return singleton;
    }
}
