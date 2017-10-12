package Annotation;

import org.springframework.stereotype.Component;

/**
 * Created by pc on 2017/9/15.
 */
@Component(value = "userDao")
public class UserDao {
    public void add(){
        System.out.println("userDao..........");
    }
}
