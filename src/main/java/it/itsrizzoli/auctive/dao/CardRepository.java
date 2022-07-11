package it.itsrizzoli.auctive.dao;

import it.itsrizzoli.auctive.model.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Integer> {

}
