package staticproxy.t1.order;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-17 19:31
 */


public class OrderServiceImpl implements IOrderService{
    private IOrderDao dao;


    public OrderServiceImpl() {
        this.dao =new OrderDaoImpl();
    }

    public int createOrder(Order order) {
        System.out.println("Service调用。创建订单成功");
        return dao.insert(order);
    }
}
