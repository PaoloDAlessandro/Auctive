package it.itsrizzoli.auctive.controllers;

import it.itsrizzoli.auctive.model.Research;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomepageController {

    @GetMapping("/home")
    public String getHomepage() {
        return "homepage";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid Research research, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "homepage";
        return "redirect:/results";
    }

    @GetMapping("/results")
    public String results() { return "results"; }
}

