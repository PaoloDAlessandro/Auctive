package it.itsrizzoli.auctive.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "offerValue deve essere inserito")
    Double offerValue;

    @ManyToOne
    @JoinColumn
    User user;

    @ManyToOne
    @JoinColumn
    Auction auction;



    public Offer() {

    }

    public Offer(int id, Double offerValue, User user, Auction auction) {
        this.id = id;
        this.offerValue = offerValue;
        this.user = user;
        this.auction = auction;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getOfferValue() {
        return offerValue;
    }

    public void setOfferValue(Double offerValue) {
        this.offerValue = offerValue;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", offerValue=" + offerValue +
                ", user=" + user +
                ", auction=" + auction +
                '}';
    }
}

