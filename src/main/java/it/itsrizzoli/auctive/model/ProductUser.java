package it.itsrizzoli.auctive.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "products_user")
public class ProductUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUserProduct;

    @NotNull
    private int quantity;

    @ManyToOne
    @JoinColumn
    User user;


    @ManyToOne
    @JoinColumn
    Product product;

    public ProductUser() {
    }

    public ProductUser(Integer idUserProduct, int quantity, User user, Product product) {
        this.idUserProduct = idUserProduct;
        this.quantity = quantity;
        this.user = user;
        this.product = product;
    }

    public Integer getIdUserProduct() {
        return idUserProduct;
    }

    public void setIdUserProduct(Integer idUserProduct) {
        this.idUserProduct = idUserProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductUser{" +
                "idUserProduct=" + idUserProduct +
                ", quantity=" + quantity +
                ", user=" + user +
                ", product=" + product +
                '}';
    }
}
