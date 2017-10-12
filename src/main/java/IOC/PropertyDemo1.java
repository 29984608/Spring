package IOC;

/**
 * Created by pc on 2017/9/9.
 */
public class PropertyDemo1 {
    private String username;

    public PropertyDemo1(String username) {
        this.username = username;
    }
    public void test1(){
        System.out.println("demo.........."+username);
    }
}
