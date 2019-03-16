package singleton.lazysimplesingleton;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 10:10
 */


public class RunThread  implements  Runnable{
    public  void run() {
         LazySimpleSingleton singleton=LazySimpleSingleton.getLazySimpleSingleton();
        System.out.println(Thread.currentThread().getName()+":"+singleton.hashCode());
    }
}
