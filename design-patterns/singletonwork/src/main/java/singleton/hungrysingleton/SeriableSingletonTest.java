package singleton.hungrysingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 13:39
 */


public class SeriableSingletonTest
{

    public static void main(String[] args) {
        SeriableSingleton s1= SeriableSingleton.getInstance();
        SeriableSingleton s2=null;


        FileOutputStream fos =null;


        try {
            fos=  new FileOutputStream("D:/SeriableSingleton.obj");
            ObjectOutputStream os =new ObjectOutputStream(fos);
            os.writeObject(s1);
            os.flush();
            os.close();

            FileInputStream fis=new FileInputStream("D:/SeriableSingleton.obj");
            ObjectInputStream in =new ObjectInputStream(fis);
            s2=(SeriableSingleton)in.readObject();


            System.out.println(s1);

            System.out.println(s2);

            System.out.println(s1==s2);

//通过序列化的到的单例模式对象和直接访问的得到的单例模式对象是不一样的 序列化是可以破坏单例模式的
//            运行结果中，可以看出，反序列化后的对象和手动创建的对象是不一致的，实例化了两
//            次，违背了单例的设计初衷。那么，我们如何保证序列化的情况下也能够实现单例？其
//            实很简单，只需要增加readResolve()方法即可

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
