package it.itsrizzoli.auctive.dao;

import it.itsrizzoli.auctive.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
