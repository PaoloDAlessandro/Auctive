package it.itsrizzoli.auctive.dao;

import it.itsrizzoli.auctive.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}