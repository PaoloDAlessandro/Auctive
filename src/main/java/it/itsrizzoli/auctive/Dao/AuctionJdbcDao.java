/*package com.amazon.WebECommerce.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.amazon.WebECommerce.model.User;

@Repository
public class UserJdbcDao {
	// Spring Boot will create and configure DataSource and JdbcTemplate
	// To use it, just @Autowired
	@Autowired
    private JdbcTemplate jdbcTemplate;

	public List<User> login(String username, String password) {
        return jdbcTemplate.query(
                "select * from utenti join auth on u.id = a.id where username = ? and password = ?",
                new Object[]{username, password},
                (rs, rowNum) ->
                        new User(
                                rs.getLong("id"),
                                rs.getString("username"),
                                rs.getString("password"),
                                rs.getString("email"),
                                rs.getString("nome"),
                                rs.getString("cognome")
                        )
        );
    }
}
*/