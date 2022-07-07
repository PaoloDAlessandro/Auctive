package it.itsrizzoli.auctive.dao;

import it.itsrizzoli.auctive.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.servlet.http.HttpSession;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("select user from User where username = :username and pass = :pass")
    public default void sessionStart(User user, HttpSession session){
        String email = user.getEmailUser();
        session.setAttribute("userLogged", email);
    }

}
