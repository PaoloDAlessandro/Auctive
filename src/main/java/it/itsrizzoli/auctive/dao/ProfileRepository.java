package it.itsrizzoli.auctive.dao;

import it.itsrizzoli.auctive.model.User;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<User, Integer> {
}
