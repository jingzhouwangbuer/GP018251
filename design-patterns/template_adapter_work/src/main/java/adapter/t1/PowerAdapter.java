package adapter.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-25 13:53
 */


public class PowerAdapter implements DC5{

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outputDC5V() {
      int output220=ac220.outputAC220V();

      int output5=output220/44;

      System.out.println("输入的电压"+output220+";输出的电压是"+output5);

      return output5;

    }
}
