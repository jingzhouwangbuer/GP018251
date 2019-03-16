package singleton.threadlocalsingleton;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 17:11
 */


public class ThreadLocalSingleTon {


    private static final ThreadLocal<ThreadLocalSingleTon> threadLocalSingleTon=
            new ThreadLocal<ThreadLocalSingleTon>(){
        @Override
        protected ThreadLocalSingleTon initialValue(){
            return new ThreadLocalSingleTon();
        }};

    private void ThreadLocalSingleTon(){

    }
    public static ThreadLocalSingleTon getInstance(){
        return threadLocalSingleTon.get();
    }


    }

