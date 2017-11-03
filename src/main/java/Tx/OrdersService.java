package Tx;

/**
 * Created by yang on 17-11-2.
 */
public class OrdersService {
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
