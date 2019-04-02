package staticproxy.t1.order;

import java.util.Date;

/**
 * @介绍 ：
 * @作者 ：RJT
 * @时间 ：2019-03-17 19:26
 */


public class Order {

    private Date createTime;

    private Object orderInfo ;

    private String id ;


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
