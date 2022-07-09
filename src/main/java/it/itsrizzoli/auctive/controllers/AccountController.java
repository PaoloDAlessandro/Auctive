package it.itsrizzoli.auctive.controllers;
import it.itsrizzoli.auctive.ProfileService;
import it.itsrizzoli.auctive.dao.UserRepository;
import it.itsrizzoli.auctive.model.Product;
import it.itsrizzoli.auctive.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/profile")
public class AccountController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProfileService service;

    @GetMapping("")
    public String getProfile(Model model, HttpSession session) {
        User user = userRepository.findByEmailUser((String) session.getAttribute("userLogged"));
        model.addAttribute("user", user);
        return "profile";
    }

    @RequestMapping("/edit/{email}")
    public ModelAndView showProfileEdit(@PathVariable(name="email") String email) {
        ModelAndView mav = new ModelAndView("profile-edit");

        User user = service.get(email);
        mav.addObject("user", user);
        return mav;
    }

    @PostMapping(path = "/save")
    public String saveProfile(@ModelAttribute("user") User user) {

        user = userRepository.findByEmailUser("userLogged");

        user.setUsername(user.getUsername());
        user.setNameUser(user.getNameUser());
        user.setSurnameUser(user.getSurnameUser());
        user.setEmailUser(user.getEmailUser());
        user.setPass(user.getPass());
        user.setConfermapass(user.getConfermapass());
        user.setAddress(user.getAddress());
        user.setBirthdate(user.getBirthdate());

        service.save(user);

        return "profile";
    }

}
