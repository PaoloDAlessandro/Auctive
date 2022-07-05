package it.itsrizzoli.auctive.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "auctions")
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_auction;

    @NotNull(message = "price deve essere inserita")
    Double starter_price;

    @Size(min = 8, max = 500)
    @NotNull(message = "description deve essere inserita")
    String auction_description;

    @NotNull(message = "sterterDate deve essere inserita")
    Date starter_date;

    @NotNull(message = "endDate deve essere inserita")
    Date end_date;

    @OneToOne
    Product product;

    public Auction() {
    }

    public Auction(int id_auction, Double starter_price, String auction_description, Date starter_date, Date end_date, Product product) {
        this.id_auction = id_auction;
        this.starter_price = starter_price;
        this.auction_description = auction_description;
        this.starter_date = starter_date;
        this.end_date = end_date;
        this.product = product;
    }

    public int getId_auction() {
        return id_auction;
    }

    public void setId_auction(int id_auction) {
        this.id_auction = id_auction;
    }

    public Double getStarter_price() {
        return starter_price;
    }

    public void setStarter_price(Double starter_price) {
        this.starter_price = starter_price;
    }

    public String getAuction_description() {
        return auction_description;
    }

    public void setAuction_description(String auction_description) {
        this.auction_description = auction_description;
    }

    public Date getStarter_date() {
        return starter_date;
    }

    public void setStarter_date(Date starter_date) {
        this.starter_date = starter_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
                "id_auction=" + id_auction +
                ", starter_price=" + starter_price +
                ", auction_description='" + auction_description + '\'' +
                ", starter_date=" + starter_date +
                ", end_date=" + end_date +
                ", product=" + product +
                '}';
    }
}
