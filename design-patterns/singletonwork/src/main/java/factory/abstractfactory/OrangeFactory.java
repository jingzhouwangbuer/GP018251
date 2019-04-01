package factory.abstractfactory;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-08 11:32
 */


public class OrangeFactory implements FruitFactory {
    public EatFruit eat() {
        return new EatOrange();
    }

    public WatchFruit watch() {
        return new WatchOrange();
    }
}
