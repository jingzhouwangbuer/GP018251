package singleton.lazysimplesingleton;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 10:02
 */


public class LazyDoubelCheckSingleton {


    private static LazyDoubelCheckSingleton singleton =null;

    public  static LazyDoubelCheckSingleton getLazySimpleSingleton(){
        if(singleton==null){
            synchronized (LazyDoubelCheckSingleton.class){
                if(singleton==null) {
                    singleton = new LazyDoubelCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
