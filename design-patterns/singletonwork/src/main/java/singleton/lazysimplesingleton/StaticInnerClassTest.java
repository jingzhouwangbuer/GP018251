package singleton.lazysimplesingleton;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-16 17:28
 */


public class StaticInnerClassTest {


    public static void main(String[] args) {
        try {

//            Class<?> clazz =LazyStaticInnerClassSingleon.class;
//
//            Constructor constructor=clazz.getDeclaredConstructor(null);
//
//            constructor.setAccessible(true);
//
//            LazyStaticInnerClassSingleon singleon =(LazyStaticInnerClassSingleon)constructor.newInstance();
//
//            System.out.println(singleon);
//
//
//            Class<?> clazz1 =LazyStaticInnerClassSingleon.class;
//            LazyStaticInnerClassSingleon  singleon1= (LazyStaticInnerClassSingleon) clazz1.newInstance();
//
//
//            System.out.println(singleon1);


            LazyStaticInnerClassSingleon singleon3= LazyStaticInnerClassSingleon.getInstance();

            System.out.println(singleon3);

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
