package adapter.work;


/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-28 21:41
 */


public class BusAdapter implements VehicleAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof  BusAdapter;
    }

    @Override
    public void go(Object adapter) {
        System.out.println("go to ByBus");
    }
}
