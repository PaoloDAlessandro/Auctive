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
    private Integer idAuction;

    @NotNull(message = "price deve essere inserita")
    Double starterPrice;

    @Size(min = 8, max = 500)
    @NotNull(message = "description deve essere inserita")
    String auctionDescription;

    @NotNull(message = "sterterDate deve essere inserita")
    Date starterDate;

    @NotNull(message = "endDate deve essere inserita")
    Date endDate;

    @OneToOne
    Product product;

    public Auction() {
    }

    public Auction(Integer idAuction, Double starterPrice, String auctionDescription, Date starterDate, Date endDate, Product product) {
        this.idAuction = idAuction;
        this.starterPrice = starterPrice;
        this.auctionDescription = auctionDescription;
        this.starterDate = starterDate;
        this.endDate = endDate;
        this.product = product;
    }

    public Integer getIdAuction() {
        return idAuction;
    }

    public void setIdAuction(Integer idAuction) {
        this.idAuction = idAuction;
    }

    public Double getStarterPrice() {
        return starterPrice;
    }

    public void setStarterPrice(Double starterPrice) {
        this.starterPrice = starterPrice;
    }

    public String getAuctionDescription() {
        return auctionDescription;
    }

    public void setAuctionDescription(String auctionDescription) {
        this.auctionDescription = auctionDescription;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "idAuction=" + idAuction +
                ", starterPrice=" + starterPrice +
                ", auctionDescription='" + auctionDescription + '\'' +
                ", starterDate=" + starterDate +
                ", endDate=" + endDate +
                ", product=" + product +
                '}';
    }
}
