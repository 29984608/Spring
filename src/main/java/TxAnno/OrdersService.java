package TxAnno;

import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yang on 17-11-2.
 */
@Transactional
public class OrdersService {
    private OrdersDao ordersDao;

    public void setOrdersDao(OrdersDao ordersDao) {
        this.ordersDao = ordersDao;
    }

    public void money(){
        ordersDao.lessMoney();

        int a = 100/0;

        ordersDao.AddMoney();
    }
}
