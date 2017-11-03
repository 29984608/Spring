package c3p0;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yang on 17-10-31.
 */
public class Text {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/c3p0.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add1();
    }
}
