package it.itsrizzoli.auctive.controllers;

import it.itsrizzoli.auctive.ProductService;
import it.itsrizzoli.auctive.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private ProductService service;


    @RequestMapping("/searched-products")
    public String showProductSerched(Model model, String keyword) {
            List<Product> list = service.getByKeyword(keyword);
            model.addAttribute("list", list);
            model.addAttribute("keyword", keyword);
        return "searched-products";
    }

    @RequestMapping("/product-list")
    public String viewHomepage(Model model) {
        List<Product> listProducts = service.listAll();
        model.addAttribute("listProducts", listProducts);
        return "product-list";
    }

    @RequestMapping("/new")
    public String showNewProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
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
