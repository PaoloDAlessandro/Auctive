package it.itsrizzoli.auctive.controllers;

import it.itsrizzoli.auctive.dao.UserRepository;
import it.itsrizzoli.auctive.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LogIn_SignUpController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/log-in")
    public String getLogin() {
        return "log-in";
    }

    @GetMapping("/sign-up")
    public String getSignup(User user) {
        return "sign-up";
    }

    @PostMapping("/sign-up")
    public String addnewUser(@Valid User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors())
            return "sign-up";

        if (!user.getPass().equals(user.getConfermapass()))
            return "sign-up";

        userRepository.save(user);
        return "redirect:/homepage";
    }

    @GetMapping("/homepage")
    public String homepage() {
        return "homepage";
    }


    //userRepository.save(new Utente(........));
}
