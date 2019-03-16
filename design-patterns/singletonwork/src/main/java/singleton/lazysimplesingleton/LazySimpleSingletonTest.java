package singleton.lazysimplesingleton;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 10:13
 */


public class LazySimpleSingletonTest {

    public static void main(String[] args) {

        Thread thead1 =new Thread(new RunThread() );
        Thread thead2 =new Thread(new RunThread() );

           thead1.start();
           thead2.start();

//        Thread-0:100758745
//        Thread-1:2075012821
// 两次线程打印单例的hashcode地址 不一样 表示这个懒汉式的单例是不安全的




    }
}
