package singleton.lazysimplesingleton;

import java.lang.reflect.Constructor;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 13:21
 */


public class ReflectTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz =LazyStaticInnerClassSingleon.class;
            Constructor constructor=  clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            LazyStaticInnerClassSingleon singleon =(LazyStaticInnerClassSingleon)constructor.newInstance();
            System.out.println(singleon);

            LazyStaticInnerClassSingleon singleon1= LazyStaticInnerClassSingleon.getInstance();

            System.out.println(singleon1);

            System.out.println(singleon==singleon1);

     // 通过反射得到的单例模式和正常访问得到的单例模式的值 是不一样的
           //通过反射可以破坏掉单例模式

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
