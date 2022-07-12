package it.itsrizzoli.auctive.controllers;
import it.itsrizzoli.auctive.ProfileService;
import it.itsrizzoli.auctive.dao.ProductUserRepository;
import it.itsrizzoli.auctive.dao.UserRepository;
import it.itsrizzoli.auctive.model.ProductUser;
import it.itsrizzoli.auctive.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping(value = "/profile")
public class AccountController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductUserRepository productUserRepository;

    @Autowired
    private ProfileService service;

    @RequestMapping("")
    public ModelAndView getProfile(HttpSession session) {
        User user = userRepository.findByEmailUser((String) session.getAttribute("userLogged"));
        List<ProductUser> userProducts = productUserRepository.findAllByUserIdUser(user.getIdUser());

        ModelAndView modelAndView = new ModelAndView();

        if (user != null){
            modelAndView.setViewName("profile");
            modelAndView.addObject("user", user);
            modelAndView.addObject("userProducts", userProducts);
            return modelAndView;
        } else {
            return null;
        }
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Integer id) {
        User user = userRepository.findByIdUser(id);

        ModelAndView modelAndView = new ModelAndView();

        if (user != null){
            modelAndView.setViewName("profile-edit");
            modelAndView.addObject("user", user);
            return modelAndView;
        } else {
            return null;
        }
    }

    @RequestMapping(value="/edit", method= RequestMethod.POST)
    public String postEdit(@ModelAttribute User user, HttpSession session) {
        User userLogged = userRepository.findByEmailUser((String) session.getAttribute("userLogged"));

        service.edit(userLogged.getIdUser(),
                user.getNameUser(), user.getSurnameUser(),
                user.getEmailUser(), user.getUsername(),
                user.getPass(), user.getConfermapass(),
                user.getBirthdate(), user.getAddress());

        return "redirect:/profile/";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.setAttribute("userLogged", null);
        session.getAttribute("userLogged");

        return "redirect:/log-in";
    }

}
