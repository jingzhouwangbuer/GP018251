package factory.abstractfactory;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-08 11:21
 */


public class AppleFactory implements FruitFactory {
    public EatFruit eat() {
        return new EatApple();
    }

    public WatchFruit watch() {
        return new WatchApple();
    }
}
