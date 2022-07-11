package it.itsrizzoli.auctive;

import it.itsrizzoli.auctive.dao.ProductRepository;
import it.itsrizzoli.auctive.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

/*
    public List<Product> getByKeyword(String keyword){
        return repo.findByKeyword(keyword);
    }
*/
    public List<Product> listAll() {
        return (List<Product>) repo.findAll();
    }

    public void save(Product product) {
        repo.save(product);
    }

    public Product get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
