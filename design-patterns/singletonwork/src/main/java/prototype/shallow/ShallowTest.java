package prototype.shallow;

import java.util.ArrayList;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-16 19:01
 */


public class ShallowTest {


    public static void main(String[] args) {
//        PrototypeImplA A =new PrototypeImplA ();
//
//        A.setAge(19);
//        A.setId("1010");
//        A.setHobbies(new ArrayList<String>());
//
//
//        PrototypeImplA B =A.clone();
//
//
//        System.out.println(A==B);
//        System.out.println(A.getHobbies()==B.getHobbies());


        PrototypeImplA A =new PrototypeImplA ();
        A.setAge(19);
        A.setId("1010");
        A.setHobbies(new ArrayList<String>());


        Client  client =new Client(A);

        PrototypeImplA B=(PrototypeImplA)client.starClone(A);
        System.out.println(A.getHobbies()==B.getHobbies());
        System.out.println(A==B);

    }
}



