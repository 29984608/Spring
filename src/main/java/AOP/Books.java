package AOP;

import org.springframework.stereotype.Component;

/**
 * Created by yang on 17-10-23.
 */
@Component(value = "books")
public class Books {
    public void books(){
        System.out.println("books......");
    }
}
