package it.itsrizzoli.auctive;

import it.itsrizzoli.auctive.model.Auction;
import org.springframework.data.repository.CrudRepository;

public interface AuctionRepository extends CrudRepository<Auction, Integer> {

}
