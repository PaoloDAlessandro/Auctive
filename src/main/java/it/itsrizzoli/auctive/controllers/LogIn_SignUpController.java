package it.itsrizzoli.auctive.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogIn_SignUpController {
    @GetMapping("/log-in")
    public String getLogin() {
        return "log-in";
    }

    @GetMapping("/sign-up")
    public String getSignup() {
        return "sign-up";
    }
}
