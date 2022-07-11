package it.itsrizzoli.auctive.controllers;

import it.itsrizzoli.auctive.ProductService;
import it.itsrizzoli.auctive.dao.ProductRepository;
import it.itsrizzoli.auctive.dao.ProductUserRepository;
import it.itsrizzoli.auctive.dao.UserRepository;
import it.itsrizzoli.auctive.model.Product;
import it.itsrizzoli.auctive.model.ProductUser;
import it.itsrizzoli.auctive.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class AppController {
    @Autowired
    private ProductService service;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductUserRepository productUserRepository;

    @Autowired
    private UserRepository userRepository;


/*    @RequestMapping("/searched-products")
    public String showProductSerched(Model model, String keyword) {
            List<Product> list = service.getByKeyword(keyword);
            model.addAttribute("list", list);
            model.addAttribute("keyword", keyword);
        return "searched-products";
    }
*/
    @RequestMapping("/product-list")
    public String viewHomepage(Model model) {
        List<Product> listProducts = service.listAll();
        model.addAttribute("listProducts", listProducts);
        return "product-list";
    }

    @RequestMapping("/new")
    public String showNewProductForm(Model model, HttpSession session) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "new-product";
    }

    @PostMapping("/new")
    public String showNewProductForm(@Valid Product product, ProductUser pu, BindingResult bindingResult, Model model, HttpSession session) {

        if(bindingResult.hasErrors()){
            return "/";
        }

        productRepository.save(product);
        model.addAttribute("product", product);

        User userLogged = userRepository.findByEmailUser ((String) session.getAttribute("userLogged"));
        pu.setProduct(product);
        pu.setUser(userLogged);
        productUserRepository.save(pu);

        return "new-product";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product) {
        service.save(product);

        return  "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductForm(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit-product");

        Product product = service.get(id);
        mav.addObject("product", product);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") int id) {

        service.delete(id);

        return "redirect:/";
    }
}
