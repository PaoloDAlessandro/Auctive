package it.itsrizzoli.auctive.dao;

import it.itsrizzoli.auctive.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("select user from User user where username = :username and pass = :password")
    List<User> login(String username, String password);
    User findByEmailUser(String userLogged);
}