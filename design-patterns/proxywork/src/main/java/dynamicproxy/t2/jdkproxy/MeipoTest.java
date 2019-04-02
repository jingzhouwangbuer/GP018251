package dynamicproxy.t2.jdkproxy;

import staticproxy.t2.findlove.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-27 17:55
 */


public class MeipoTest  {

    public static void main(String[] args) throws Exception {
        Person person= (Person)new JDKMeipo().getInstance(new Customer());

        person.findLove();

       //通过反编译工具可以查看源代码
        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
        FileOutputStream os = new FileOutputStream("D://$Proxy0.class");
        os.write(bytes);
        os.close();

    }

}

