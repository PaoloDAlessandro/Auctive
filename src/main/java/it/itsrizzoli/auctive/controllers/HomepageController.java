package it.itsrizzoli.auctive.controllers;

//import it.itsrizzoli.auctive.model.Research;
import com.fasterxml.jackson.databind.node.ArrayNode;
import it.itsrizzoli.auctive.dao.UserRepository;
import it.itsrizzoli.auctive.model.ProductUser;
import it.itsrizzoli.auctive.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class HomepageController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String getHomepage(Model model, User user, HttpSession session) {
        user = userRepository.findByEmailUser((String) session.getAttribute("userLogged"));
        model.addAttribute("user", user);
        return "/index";
    }

}

