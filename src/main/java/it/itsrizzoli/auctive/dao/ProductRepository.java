package it.itsrizzoli.auctive.dao;

import it.itsrizzoli.auctive.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    //@Query("select * form products where product_name like '%' || :keyword || '%';")
    //List<Product> findByKeyword(@Param("keyword") String keyword);
}
