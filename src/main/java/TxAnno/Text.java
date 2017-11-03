package TxAnno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by yang on 17-11-2.
 */
public class Text {
    @Test
    public void text(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/txanno.xml");
        OrdersService ordersService = (OrdersService) context.getBean("ordersService");
        ordersService.money();
    }
}
