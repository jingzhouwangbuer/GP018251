package factory.simplefactory;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-08 10:05
 */


public class Test {

    public static void main(String[] args) throws Exception {
         FruitFactory factory =new FruitFactory();
         Fruit apple =factory.produce(Apple.class);
         apple.print();

         Fruit orange =factory.produce(Orange.class);
         orange.print();
    }
}
