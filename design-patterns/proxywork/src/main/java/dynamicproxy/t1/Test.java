package dynamicproxy.t1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-17 19:48
 */


public class Test
{

    public static void main(String[] args) {

        Order order= new Order();
        order.setCreateTime(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        IOrderService orderService =(IOrderService)new OrderStaticProxy().getInstance(new OrderServiceImpl());
        orderService.createOrder(order);
    }
}
