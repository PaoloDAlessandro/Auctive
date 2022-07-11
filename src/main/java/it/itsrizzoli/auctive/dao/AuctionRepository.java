package it.itsrizzoli.auctive.dao;

import it.itsrizzoli.auctive.model.Auction;
import it.itsrizzoli.auctive.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuctionRepository extends CrudRepository<Auction, Integer> {
    @Query("select auction from Auction auction where auction_description like '%' || :keyword || '%'")
    List<Auction> findByKeyword(@Param("keyword") String keyword);
}
