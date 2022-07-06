package it.itsrizzoli.auctive.controllers;

import it.itsrizzoli.auctive.AuctionRepository;
import it.itsrizzoli.auctive.model.Auction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/demo")
public class AuctionController {
    @Autowired
    private AuctionRepository auctionRepository;

    @GetMapping(path = "/all")
    public String getAllAuctions(Model m) {
        ArrayList<Auction> list = (ArrayList<Auction>) auctionRepository.findAll();
        m.addAttribute("listauction", list);
        return "auction.html";
    }
}
