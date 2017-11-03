package Tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yang on 17-11-2.
 */
@Component(value = "orderService")
public class OrdersService {
    @Autowired
    private OrdersDao ordersDao;

    public void setOrdersDao(OrdersDao ordersDao) {
        this.ordersDao = ordersDao;
    }
    public void money(){
        ordersDao.lessMoney();

        //假设异常
        int a = 100/0;

        ordersDao.AddMoney();
    }
}
