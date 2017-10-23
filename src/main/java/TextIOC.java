import AOP.Book;
import AOP.Books;
import Annotation.User;
import Annotation.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pc on 2017/9/7.
 */
public class TextIOC {
        @Test
        public void test2 (){
            ApplicationContext context = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
            User user = (User) context.getBean("user");
            user.add();
        }
        @Test
        public void test3(){
            ApplicationContext context = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
            UserService service= (UserService) context.getBean("userService");
            service.add();
        }
        @Test
    public void test4(){
            ApplicationContext context = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
           Book book = (Book) context.getBean("book");
           book.add();
        }
        @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
        Books books = (Books) context.getBean("books");
        books.books();
        }

}
