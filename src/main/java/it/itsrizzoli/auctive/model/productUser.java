package it.itsrizzoli.auctive.model;

import javax.persistence.*;

@Entity
@Table(name = "product_user")
public class productUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn
    User user;

    @ManyToOne
    @JoinColumn
    Product product;

    public productUser() {
    }

    public productUser(int id, User user, Product product) {
        this.id = id;
        this.user = user;
        this.product = product;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "productUser{" +
                "id=" + id +
                ", user=" + user +
                ", product=" + product +
                '}';
    }
}
