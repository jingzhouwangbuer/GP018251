package singleton.enumsingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-14 15:40
 */
public class EnumSingleTonTest
{
//    public static void main(String[] args) {
//        try {
//
//            Class<?> clazz = EnumSingleTon.class;
//
//            Constructor constructor = clazz.getDeclaredConstructor(null);
//
//            EnumSingleTon singleTon =(EnumSingleTon)constructor.newInstance();
//
//            singleTon.setData(new Object());
//
//
//            EnumSingleTon   singleTon2=   EnumSingleTon.getInstance();
//            singleTon.setData(new Object());
//
//            System.out.println(singleTon);
//            System.out.println(singleTon2);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }


    public static void main(String[] args) {
        try{
            EnumSingleTon s1 =EnumSingleTon.getInstance();

            s1.setData(new Object());

            EnumSingleTon s2 =null;

            FileOutputStream fos =new FileOutputStream("D:/EnumSingleTon.obj");

            ObjectOutputStream os =new ObjectOutputStream(fos);

            os.writeObject(s1);

            os.flush();

            os.close();

            FileInputStream fis =new FileInputStream("D:/EnumSingleTon.obj");

            ObjectInputStream is =new ObjectInputStream(fis);

            s2=(EnumSingleTon)is.readObject();

            System.out.println(s1.getData());
            System.out.println(s2.getData());

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
