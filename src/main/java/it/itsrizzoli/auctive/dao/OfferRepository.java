package it.itsrizzoli.auctive.dao;

import it.itsrizzoli.auctive.model.Offer;
import org.springframework.data.repository.CrudRepository;

public interface OfferRepository extends CrudRepository<Offer, Integer> {

}
