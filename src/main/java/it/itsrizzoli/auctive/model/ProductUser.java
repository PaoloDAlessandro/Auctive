package it.itsrizzoli.auctive.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "products_user")
public class ProductUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_user_product;

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

    public ProductUser(int id_user_product, int quantity, User user, Product product) {
        this.id_user_product = id_user_product;
        this.quantity = quantity;
        this.user = user;
        this.product = product;
    }

    public int getId_user_product() {
        return id_user_product;
    }

    public void setId_user_product(int id_user_product) {
        this.id_user_product = id_user_product;
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
                "id_user_product=" + id_user_product +
                ", quantity=" + quantity +
                ", user=" + user +
                ", product=" + product +
                '}';
    }

}
