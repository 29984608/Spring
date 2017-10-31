package JdbcTemplate;

import entity.User;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class JdbcTemplateText1 {
    @Test
    public void add(){
        //创建对象，设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/text?useUnicode=true&characterEncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //创建jdbcTemplate对象，设置数据源
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        //调用jdbcTemplate对象里面的方法实现操作
        String sql = "insert into user (username,password) values(?,?);";
        jdbcTemplate.update(sql,"Mary",123456);
    }
    @Test
    public void update(){
        //创建对象，设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/text?Unicode=true&characterEncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //创建jdbcTemplate对象，设置数据源
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "update user set username=?,password=? where id=?";
        //调用jdbcTemplate里面的方法实现update方法、
        jdbcTemplate.update(sql,"邹",8888888,2);
    }
    @Test
    public void delete(){
        //创建对象，设置数据库信息
        DriverManagerDataSource dataSource =new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/text?Unicode=true&characterEncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //创建jdbcTemplate对象，设置数据源
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "delete from user where id=?";
        //调用jdbcTemplate对象里面的方法实现操作
        jdbcTemplate.update(sql,11);

    }
    @Test
    public void select1(){
        //创建对象，设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/text?Unicode=true&characterUncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //创建jdbcTemplate对象，设置数据源
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        //调用jdbcTemplate对象里面的方法实现操作
        String sql = "select count(*) from user";
        //第二个参数，是返回类型的class
        Integer a = jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println(a);
    }
    @Test
    public void selete2(){
        //创建对象设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/text?Unicode=true&characterUncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //创建jdbcTemplate对象设置数据源
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        //调用jdbcTemplate对象里面的方法实现操作
        String sql = "select * from user where id = ?";
        //第二个参数是接口RowMapper，需要自己写类实现接口，自己做数据封装
        User user = jdbcTemplate.queryForObject(sql, new MyRowMapper(),1);
        System.out.println(user);
    }
    @Test
    public void select3(){
        //创建对象设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/text?Unicode=true&characterUncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //创建jdbcTemplate对象设置数据源
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        //调用jdbcTemplate对象里面的方法实现操作
        String sql = "select * from user";
        //调用jdbcTemplate方法实现
         //第一个参数 sql语句
         //第二个参数 RowMapper
         //第三个参数 预编译sql语句参数 可是省略
        List<User> users = jdbcTemplate.query(sql,new MyRowMapper());
        System.out.println(users);

    }
}
class MyRowMapper implements RowMapper<User>{

    public User mapRow(ResultSet resultSet, int num) throws SQLException {
        //1 从结果集中把数据得到
        int id = Integer.parseInt(resultSet.getString("id"));
        String username = resultSet.getString("username");
        String password = resultSet.getString("password");
        //2 把得到数据封装到对象里面
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassowrd(password);
        return user;
    }
}