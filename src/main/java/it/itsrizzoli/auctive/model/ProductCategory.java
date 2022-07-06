package it.itsrizzoli.auctive.model;

import javax.persistence.*;

@Entity
@Table(name = "product_categories")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProductCategory;

    @ManyToOne
    @JoinColumn
    Product product;

    @ManyToOne
    @JoinColumn
    Category category;

    public ProductCategory() {
    }

    public ProductCategory(Integer idProductCategory, Product product, Category category) {
        this.idProductCategory = idProductCategory;
        this.product = product;
        this.category = category;
    }

    public Integer getIdProductCategory() {
        return idProductCategory;
    }

    public void setIdProductCategory(Integer idProductCategory) {
        this.idProductCategory = idProductCategory;
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
        return "ProductCategory{" +
                "idProductCategory=" + idProductCategory +
                ", product=" + product +
                ", category=" + category +
                '}';
    }
}
