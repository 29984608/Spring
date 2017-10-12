package IOC;

/**
 * Created by pc on 2017/9/9.
 */
public class Book {
    private String bookname;

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void demobook(){
        System.out.println("book.........."+bookname);
    }
}
