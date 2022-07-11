package it.itsrizzoli.auctive.controllers;
import it.itsrizzoli.auctive.ProfileService;
import it.itsrizzoli.auctive.dao.UserRepository;
import it.itsrizzoli.auctive.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String getProfile(Model model, User user, HttpSession session) {
        user = userRepository.findByEmailUser((String) session.getAttribute("userLogged"));
        model.addAttribute("user", user);
        return "profile";
    }

    @GetMapping(path = "/edit")
    public String getProfileEdit(User user, HttpSession session) {
        //User userLogged = (User) session.getAttribute("userLogged");
        return "profile-edit.html";
    }


    /*@GetMapping("/edit/{id}")
    public ModelAndView showEditProfileForm(@PathVariable(name = "id") Integer id) {
        ModelAndView mav = new ModelAndView("profile-edit");

        User user = service.get(id);
        mav.addObject("user", user);

        return mav;
    }*/

}
