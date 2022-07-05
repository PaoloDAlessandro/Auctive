package it.itsrizzoli.auctive.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_card;

    @NotNull(message = "idUser deve essere inserito")
    int idUser;

    @Size(min = 15, max = 19)
    @NotNull(message = "cardNumver deve essere inserito")
    Integer card_number;

    @NotNull(message = "expireDate deve essere inserito")
    Date expire_date;

    @NotNull(message = "cvv deve essere inserito")
    @Size(min = 3, max = 3)
    String cvv;

    @ManyToOne
    @JoinColumn
    User user_card;

    public Card() {

    }

    public Card(int id_card, int idUser, Integer card_number, Date expire_date, String cvv, User user_card) {
        this.id_card = id_card;
        this.idUser = idUser;
        this.card_number = card_number;
        this.expire_date = expire_date;
        this.cvv = cvv;
        this.user_card = user_card;
    }

    public int getId_card() {
        return id_card;
    }

    public void setId_card(int id_card) {
        this.id_card = id_card;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Integer getCard_number() {
        return card_number;
    }

    public void setCard_number(Integer card_number) {
        this.card_number = card_number;
    }

    public Date getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(Date expire_date) {
        this.expire_date = expire_date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public User getUser_card() {
        return user_card;
    }

    public void setUser_card(User user_card) {
        this.user_card = user_card;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id_card=" + id_card +
                ", idUser=" + idUser +
                ", card_number=" + card_number +
                ", expire_date=" + expire_date +
                ", cvv='" + cvv + '\'' +
                ", user_card=" + user_card +
                '}';
    }
}
