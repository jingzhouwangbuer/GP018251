package dynamicproxy.t1;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-17 19:29
 */


public class OrderDaoImpl implements IOrderDao {

    public int insert(Order order) {
        System.out.println("Dao插入数据成功");
        return 0;
    }
}
