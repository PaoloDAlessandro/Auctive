package it.itsrizzoli.auctive.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "offers")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_offer;

    @NotNull(message = "offerValue deve essere inserito")
    Double offer_value;

    @ManyToOne
    @JoinColumn
    User user;

    @ManyToOne
    @JoinColumn
    Auction auction;

    public Offer() {
    }

    public Offer(int id_offer, Double offer_value, User user, Auction auction) {
        this.id_offer = id_offer;
        this.offer_value = offer_value;
        this.user = user;
        this.auction = auction;
    }

    public int getId_offer() {
        return id_offer;
    }

    public void setId_offer(int id_offer) {
        this.id_offer = id_offer;
    }

    public Double getOffer_value() {
        return offer_value;
    }

    public void setOffer_value(Double offer_value) {
        this.offer_value = offer_value;
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
                "id=" + id_offer +
                ", offerValue=" + offer_value +
                ", user=" + user +
                ", auction=" + auction +
                '}';
    }
}

