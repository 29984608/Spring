package IOC;

/**
 * Created by pc on 2017/9/9.
 */
public class UserService {
    //1.定义dao类型属性
    private UserDao userDao;
    //2.生成set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("servie.................");
        userDao.dao();
    }

}
