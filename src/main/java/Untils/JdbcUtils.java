package Untils;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Created by pc on 2017/9/18.
 */

public class JdbcUtils {
    static String url = "jdbc:mysql://localhost:3306/test";
    static String name = "root";
    static String password = "root";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,name,password);
            if (connection != null){
                System.out.println("连接成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void close(Connection connection){
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void test1(){
        Connection conn = JdbcUtils.getConnection();
    }
    }
