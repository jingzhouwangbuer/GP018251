package factorymethod;



/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-08 10:19
 */


public class OrangeFactory implements FruitInterface {
    public Fruit factory() {
        return new Orange();
    }
}
