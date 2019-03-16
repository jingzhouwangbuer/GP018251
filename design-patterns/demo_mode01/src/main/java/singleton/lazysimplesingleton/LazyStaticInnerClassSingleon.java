package singleton.lazysimplesingleton;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 11:41
 */

//静态内部的的单例模式
public class LazyStaticInnerClassSingleon {
    private LazyStaticInnerClassSingleon(){
        if(InnerClass.singleon!=null){
            throw new RuntimeException("单例模式不允许多次创建");
        }
    }

    public static final LazyStaticInnerClassSingleon getInstance(){
        return InnerClass.singleon;
    }

    private static class InnerClass{
    private static final LazyStaticInnerClassSingleon singleon=new LazyStaticInnerClassSingleon();
    }
}
