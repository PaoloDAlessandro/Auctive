package it.itsrizzoli.auctive.controllers;

//import it.itsrizzoli.auctive.model.Research;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomepageController {

    @GetMapping("/")
    public String getHomepage() {
        return "/index";
    }

}

