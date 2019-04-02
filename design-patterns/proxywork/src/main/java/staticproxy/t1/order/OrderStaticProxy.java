package staticproxy.t1.order;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-17 19:33
 */


public class OrderStaticProxy implements IOrderService{

    private  IOrderService service;

    public SimpleDateFormat format  =new SimpleDateFormat("yyyy-MM-dd");

    public int createOrder(Order order) {

        before();

        Date date=order.getCreateTime();

        String time =format.format(date);

        System.out.println("静态代理类自动分配到【DB_" + time + "】数据源处理数据。");

        DynamicDataSourceEntry.setDefaultDataSource(time);

        String  str=DynamicDataSourceEntry.get();
        System.out.println(str);
        service.createOrder(order);

        after();

        return 0;
    }

    public OrderStaticProxy() {
        this.service = new OrderServiceImpl();
    }

    public void before(){
        System.out.println("前置加强");
    }


    public void after(){
        System.out.println("后置加强");
    }


}
