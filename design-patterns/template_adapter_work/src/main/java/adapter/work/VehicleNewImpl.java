package adapter.work;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-28 21:46
 */


public class VehicleNewImpl extends IVehicle implements IVehicleNew{
    @Override
    public void onfoot() {
        super.onfoot();
     }

    @Override
    public void rideBike() {
        super.rideBike();
    }

    @Override
    public void byCar() {
        parseGo(CarAdapter.class);
    }

    @Override
    public void ByBus() {
        parseGo(BusAdapter.class);
    }

    @Override
    public void BySubWay() {
         parseGo(SubWayAdapter.class);
    }

    public void parseGo(Class<? extends VehicleAdapter> clazz)  {

        VehicleAdapter adapter = null;
        try {
            adapter = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        if(adapter.support(adapter)){
            adapter.go(adapter);
        };

    }

}
