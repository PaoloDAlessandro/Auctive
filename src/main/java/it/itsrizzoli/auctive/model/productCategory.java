package it.itsrizzoli.auctive.model;

import javax.persistence.*;

@Entity
@Table(name = "product_category")
public class productCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn
    Product product;

    @ManyToOne
    @JoinColumn
    Category category;

    public productCategory() {
    }

    public productCategory(int id, Product product, Category category) {
        this.id = id;
        this.product = product;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", product=" + product +
                ", category=" + category +
                '}';
    }

}
