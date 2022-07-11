package it.itsrizzoli.auctive.dao;

import it.itsrizzoli.auctive.model.ProductUser;
import org.springframework.data.repository.CrudRepository;

public interface ProductUserRepository extends CrudRepository<ProductUser, Integer> {
}
