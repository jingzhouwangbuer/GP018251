package decorator.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 17:43
 */


public class BattercakeDecoratorTest {


    public static void main(String[] args) {

        Battercake battercake =new BaseBattercake();

        System.out.println(battercake.getMsg()+",总价"+battercake.getPrice());
        battercake=new EggDecorator(battercake);

        System.out.println(battercake.getMsg()+",总价"+battercake.getPrice());

        battercake=new SausageDecorator(battercake);

        System.out.println(battercake.getMsg()+",总价"+battercake.getPrice());

        battercake=new SausageDecorator(battercake);

        System.out.println(battercake.getMsg()+",总价"+battercake.getPrice());

    }
}
