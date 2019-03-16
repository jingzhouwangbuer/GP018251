package factory.factorymethod;


/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-08 10:20
 */


public class AppleFactory implements FruitInterface {
    static{
        System.out.println("工厂方法模式");
    }
    public Fruit factory() {

        return new Apple();
    }
}
