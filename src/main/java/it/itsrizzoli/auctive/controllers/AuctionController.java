package it.itsrizzoli.auctive.controllers;

import it.itsrizzoli.auctive.AuctionService;
import it.itsrizzoli.auctive.ProductService;
import it.itsrizzoli.auctive.dao.AuctionRepository;
import it.itsrizzoli.auctive.dao.OfferRepository;
import it.itsrizzoli.auctive.dao.UserRepository;
import it.itsrizzoli.auctive.model.Auction;
import it.itsrizzoli.auctive.model.Offer;
import it.itsrizzoli.auctive.model.Product;
import it.itsrizzoli.auctive.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class AuctionController {
    @Autowired
    private AuctionRepository auctionRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OfferRepository offerRepository;

    @Autowired
    private AuctionService service;

    @GetMapping(path = "/auctions")
    public String getAllAuctions(Model m, User user, HttpSession session) {
        ArrayList<Auction> list = (ArrayList<Auction>) auctionRepository.findAll();
        user = getuserSession(m, user, session);
        System.out.println(user);
        m.addAttribute("listauction", list);
        return "auction.html";
    }

    public User getuserSession(Model m, User user, HttpSession session) {
        user = userRepository.findByEmailUser((String) session.getAttribute("userLogged"));
        m.addAttribute("user", user);
        return user;
    }

    @GetMapping(path = "/placeABid")
    public String setABid(@RequestParam int id_product, Double value, HttpSession session, Model m) {
        User user = new User();
        user = getuserSession(m, user, session);
        Offer offer = new Offer(value, user.getIdUser(), id_product);
        offerRepository.save(offer);
        return "index";
    }

    @GetMapping(path = "/product")
    public String getSingleAuction(@RequestParam int id,  Model m){
        Optional<Auction> auction = auctionRepository.findById(id);
        if (auction.isPresent()) {
            Auction au = auction.get();
            m.addAttribute("auction", au);
        }
        return "productPage";
    }

    @RequestMapping("/searched-products")
    public String showProductSerched(Model model, String keyword) {
        List<Auction> list = service.getByKeyword(keyword);
        if (list.isEmpty()) {
            return "no-result";
        }
        model.addAttribute("list", list);
        model.addAttribute("keyword", keyword);
        return "searched-products";
    }
}
