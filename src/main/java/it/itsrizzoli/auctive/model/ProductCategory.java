package it.itsrizzoli.auctive.model;

import javax.persistence.*;

@Entity
@Table(name = "product_categories")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_product_category;

    @ManyToOne
    @JoinColumn
    Product product;

    @ManyToOne
    @JoinColumn
    Category category;

    public ProductCategory() {
    }

    public ProductCategory(int id_product_category, Product product, Category category) {
        this.id_product_category = id_product_category;
        this.product = product;
        this.category = category;
    }

    public int getId_product_category() {
        return id_product_category;
    }

    public void setId_product_category(int id_product_category) {
        this.id_product_category = id_product_category;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "productCategory{" +
                "id=" + id_product_category +
                ", product=" + product +
                ", category=" + category +
                '}';
    }

}
