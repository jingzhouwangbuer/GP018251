package singleton.hungrysingleton;

import java.io.Serializable;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 13:38
 */


public class SeriableSingleton implements Serializable{

    private static final SeriableSingleton singleton =new SeriableSingleton();

    public static SeriableSingleton getInstance(){
        return  singleton;
    }

    private Object readResolve(){
        return singleton;
    }
}
