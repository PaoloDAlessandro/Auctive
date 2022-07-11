package it.itsrizzoli.auctive.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "offers")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idOffer;

    @NotNull(message = "offerValue deve essere inserito")
    Double offerValue;

    @NotNull
    Integer id_user;
    @NotNull
    Integer id_auction;

    public Offer() {
    }

    public Offer(Double offerValue, Integer id_user, Integer id_auction) {
        this.offerValue = offerValue;
        this.id_user = id_user;
        this.id_auction = id_auction;
    }

    public Integer getIdOffer() {
        return idOffer;
    }

    public void setIdOffer(Integer idOffer) {
        this.idOffer = idOffer;
    }

    public Double getOfferValue() {
        return offerValue;
    }

    public void setOfferValue(Double offerValue) {
        this.offerValue = offerValue;
    }


    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_auction() {
        return id_auction;
    }

    public void setId_auction(Integer id_auction) {
        this.id_auction = id_auction;
    }
}

