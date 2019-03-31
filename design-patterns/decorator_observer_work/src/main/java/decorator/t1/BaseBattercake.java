package decorator.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 17:30
 */


public class BaseBattercake extends Battercake{
    protected String getMsg() {
        return "煎饼";
    }

    protected int getPrice() {
        return 4;
    }
}
