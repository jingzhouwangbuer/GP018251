package abstrctfactory;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-08 11:29
 */


public class Test {

    public static void main(String[] args) {
        FruitFactory appleFactory =new AppleFactory();
        appleFactory.eat().eatFuit();
        appleFactory.watch().watchFuit();


        FruitFactory orangeFactory=new OrangeFactory();
        orangeFactory.eat().eatFuit();
        orangeFactory.watch().watchFuit();
    }
}
