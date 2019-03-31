package decorator.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 17:32
 */


public abstract class BattercakeDecorator  extends Battercake{
    private Battercake battercake;


    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }
    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
