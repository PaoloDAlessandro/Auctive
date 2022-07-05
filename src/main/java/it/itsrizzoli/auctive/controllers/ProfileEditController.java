package it.itsrizzoli.auctive.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileEditController {
    @GetMapping("/profile-edit")
    public String getProfileEdit() {
        return "profile-edit";
    }
}
