package it.itsrizzoli.auctive.controllers;

import it.itsrizzoli.auctive.dao.AuctionRepository;
import it.itsrizzoli.auctive.model.Auction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
@RequestMapping(value = "/auction")
public class AuctionController {
    @Autowired
    private AuctionRepository auctionRepository;

    @GetMapping(path = "/all")
    public String getAllAuctions(Model m) {
        ArrayList<Auction> list = (ArrayList<Auction>) auctionRepository.findAll();
        m.addAttribute("listauction", list);
        return "auction.html";
    }

    @GetMapping(path = "/product")
    public String getSingleAuction(@RequestParam int id, Model m){
        Optional<Auction> auction = auctionRepository.findById(id);
        if (auction.isPresent()) {
            Auction au = auction.get();
            m.addAttribute("auction", au);
        }
        return "productPage";
    }
}
