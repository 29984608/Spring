package AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by yang on 17-10-23.
 */
@Component(value = "mybooks")
@Aspect
public class MyBooks {
    @Before("execution(* AOP.Books.*(..))")
    public void mybooks(){
        System.out.println("before.....");
    }
}
