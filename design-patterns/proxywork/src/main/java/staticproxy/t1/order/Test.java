package staticproxy.t1.order;

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

        IOrderService orderService =new OrderStaticProxy();
        orderService.createOrder(order);
    }
}
