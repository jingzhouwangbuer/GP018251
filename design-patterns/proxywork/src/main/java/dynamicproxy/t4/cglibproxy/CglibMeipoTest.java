package dynamicproxy.t4.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-04-02 22:17
 */


public class CglibMeipoTest {


    public static void main(String[] args) {
        Class<?> clazz = Person.class;
         //利用cglib 的代理类可以将内存中的class 文件写入本地磁盘
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                "D://test/");
      Person person=(Person)  new CglibMeipo().getInstance(clazz);

      person.findLove();
    }
}
