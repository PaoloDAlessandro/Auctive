package it.itsrizzoli.auctive.dao;

import it.itsrizzoli.auctive.model.Product;
import it.itsrizzoli.auctive.model.ProductUser;
import it.itsrizzoli.auctive.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductUserRepository extends CrudRepository<ProductUser, Integer> {
    List<ProductUser> findAllByUserIdUser(Integer id);
}
