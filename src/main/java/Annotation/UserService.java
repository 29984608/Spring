package Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by pc on 2017/9/15.
 */
@Component(value = "userService")
public class UserService {
    //1 定义dao类型属性
    //在dao属性上面使用注解 完成对象注入
  //  @Autowired
    @Resource(name = "userDao")
    private  UserDao userDao;
    //使用注解方式时不需要set方法
    public void add(){
        System.out.println("userService......");
        userDao.add();
    }
}
