package it.itsrizzoli.auctive.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
    @GetMapping("/profile")
    public String getProfile() {
        return "profile";
    }
}
