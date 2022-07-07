package it.itsrizzoli.auctive.controllers;

import it.itsrizzoli.auctive.dao.UserRepository;
import it.itsrizzoli.auctive.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class LogIn_SignUpController {
    @Autowired
    UserRepository userRepository;



    @GetMapping("/sign-up")
    public String getSignup(User user) {
        return "sign-up";
    }

    @PostMapping("/sign-up")
    public String addnewUser(@Valid User user, BindingResult bindingResult, HttpSession sessione) {
        if(bindingResult.hasErrors())
            return "sign-up";

        if (!user.getPass().equals(user.getConfermapass()))
            return "sign-up";

        userRepository.save(user);

        sessione.setAttribute("utenteloggato", user);
        return "redirect:/homepage";
    }


    //logout
    //sessione.setAttribute("utenteloggato", null);

    //altrimetodi se utente loggato
    //User utenteloggato = sessione.getAttribute("utenteloggato");
    //if (utenteloggayo != null) allora utente è loggato

    @GetMapping("/log-in")
    public String getLogin(User user) {
        return "log-in";
    }

    @PostMapping("/log-in")
    public String connectUser(@Valid User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors())
            return "log-in";




        return "redirect:/homepage";
    }

    @GetMapping("/homepage")
    public String homepage() {
        return "homepage";
    }

    //userRepository.save(new Utente(........));
}
