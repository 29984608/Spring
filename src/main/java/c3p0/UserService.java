package c3p0;

/**
 * Created by yang on 17-10-31.
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add1(){
        userDao.add2();
    }
}
