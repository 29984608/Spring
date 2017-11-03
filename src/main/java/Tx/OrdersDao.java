package Tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by yang on 17-11-2.
 */
@Component(value = "orederDao")
public class OrdersDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    //减少钱
    public void lessMoney(){
        String sql = "update user set salary = salary - ? where id =?";
        jdbcTemplate.update(sql,100,1);
    }
    //增加钱
    public void AddMoney(){
        String sql = "update user set salary = salary + ? where id =?";
        jdbcTemplate.update(sql,100,2);
    }
}
