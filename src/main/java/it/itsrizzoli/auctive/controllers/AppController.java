package it.itsrizzoli.auctive.controllers;

import it.itsrizzoli.auctive.ProductService;
import it.itsrizzoli.auctive.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private ProductService service;

    @RequestMapping("/research-results")
    public String viewHomepage(Model model) {
        List<Product> listProducts = service.listAll();
        model.addAttribute("listProducts", listProducts);
        return "research-results";
    }
}
