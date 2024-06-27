package io.taylor.springbootmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class H2Runner implements ApplicationRunner {
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try(Connection connection = dataSource.getConnection()) {
            connection.getMetaData().getURL();
            connection.getMetaData().getUserName();

            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE USERS(ID INTEGER NOT NULL, NAME VARCHAR(255), PRIMARY KEY (ID))";
            statement.executeUpdate(sql);
            // 에러 시 롤백 구문 추가되어야 함
        }

        jdbcTemplate.execute("INSERT INTO USERS VALUES (1, 'taylor')");
        // JdbcTemplate 사용시 에러 문구 가독성이 더 좋음
    }
}
