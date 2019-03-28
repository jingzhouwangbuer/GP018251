package adapter.work;


/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-28 21:44
 */


public class SubWayAdapter implements VehicleAdapter{


    @Override
    public boolean support(Object adapter) {
        return adapter instanceof  SubWayAdapter;
    }

    @Override
    public void go(Object adapter) {
        System.out.println("go to BySubWay");
    }
}
