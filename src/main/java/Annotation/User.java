package Annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by pc on 2017/9/14.
 */
@Component(value = "user")
public class User {
    public void add(){
        System.out.println("add............");
    }
}
