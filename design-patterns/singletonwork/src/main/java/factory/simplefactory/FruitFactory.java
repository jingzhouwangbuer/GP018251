package factory.simplefactory;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-08 9:56
 */


public class FruitFactory {

    static{
        System.out.println("简单工厂模式");
    }
    public Fruit produce(Class clazz) throws Exception{

        return (Fruit)clazz.newInstance();
    }
}
