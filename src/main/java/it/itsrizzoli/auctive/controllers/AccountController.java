package it.itsrizzoli.auctive.controllers;

import it.itsrizzoli.auctive.dao.UserRepository;
import it.itsrizzoli.auctive.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AccountController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/profile")
    public String getProfile(User user, HttpSession session) {
        //user = (User) session.getAttribute("userLogged");
        user = userRepository.findByEmailUser((String) session.getAttribute("userLogged"));
        System.out.println(user.getEmailUser());
        return "profile";
    }
}

