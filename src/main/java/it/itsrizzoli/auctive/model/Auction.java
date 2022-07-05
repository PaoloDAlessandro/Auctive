package it.itsrizzoli.auctive.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "auction")
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "idProduct deve essere inserito")
    int idProduct;

    @NotNull(message = "price deve essere inserita")
    Double price;

    @Size(min = 8, max = 500)
    @NotNull(message = "description deve essere inserita")
    String description;

    @NotNull(message = "sterterDate deve essere inserita")
    Date starterDate;

    @NotNull(message = "endDate deve essere inserita")
    Date endDate;

    @OneToOne
    Product product;

    public Auction() {
    }

    public Auction(int id, int idProduct, Double price, String description, Date starterDate, Date endDate, Product product) {
        this.id = id;
        this.idProduct = idProduct;
        this.price = price;
        this.description = description;
        this.starterDate = starterDate;
        this.endDate = endDate;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStarterDate() {
        return starterDate;
    }

    public void setStarterDate(Date starterDate) {
        this.starterDate = starterDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Product getProducts() {
        return product;
    }

    public void setProducts(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "id=" + id +
                ", idProduct=" + idProduct +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", starterDate=" + starterDate +
                ", endDate=" + endDate +
                ", product=" + product +
                '}';
    }

}
