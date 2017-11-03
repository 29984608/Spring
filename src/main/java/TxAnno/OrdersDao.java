package TxAnno;

import org.springframework.jdbc.core.JdbcTemplate;


/**
 * Created by yang on 17-11-2.
 */

public class OrdersDao {
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
