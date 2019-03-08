package factorymethod;

import simplefactory.Fruit;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-08 10:05
 */


public class Test {

    public static void main(String[] args) throws Exception {

        FruitInterface appleFacroty = new AppleFactory();
        Fruit apple =appleFacroty.factory();
        apple.print();

        FruitInterface orangeFacroty = new OrangeFactory();
        Fruit orange=orangeFacroty.factory();
        orange.print();
    }

}
