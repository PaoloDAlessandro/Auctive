package it.itsrizzoli.auctive.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

    @GetMapping("/home")
    public String getHomepage() {
        return "homepage";
    }

}
