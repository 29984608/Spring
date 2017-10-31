package c3p0;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by yang on 17-10-31.
 */
public class UserDao {
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add2() {
    String sql = "insert into user (username, password) values(?,?) ";
    jdbcTemplate.update(sql,"jack",987654);

    }
}
