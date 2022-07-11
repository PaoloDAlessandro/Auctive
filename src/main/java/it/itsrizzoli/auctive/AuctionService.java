package it.itsrizzoli.auctive;

import it.itsrizzoli.auctive.dao.AuctionRepository;
import it.itsrizzoli.auctive.model.Auction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionService {
    @Autowired
    private AuctionRepository repo;


    public List<Auction> getByKeyword(String keyword){
        return repo.findByKeyword(keyword);
    }

    public List<Auction> listAll() {
        return (List<Auction>) repo.findAll();
    }

    public void save(Auction auction) {
        repo.save(auction);
    }

    public Auction get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
