package decorator.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 17:38
 */


public class EggDecorator extends BattercakeDecorator {

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"加一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }

}
