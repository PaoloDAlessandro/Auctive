package it.itsrizzoli.auctive.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "idUser deve essere inserito")
    int idUser;

    @Size(min = 15, max = 19)
    @NotNull(message = "cardNumver deve essere inserito")
    Integer cardNumber;

    @NotNull(message = "expireDate deve essere inserito")
    Date expiredate;

    @NotNull(message = "cvv deve essere inserito")
    @Size(min = 3, max = 3)
    String cvv;

    @ManyToOne
    @JoinColumn
    User user_card;

    public Card() {

    }

    public Card(int id, int idUser, Integer cardNumber, Date expiredate, String cvv, User user_card) {
        this.id = id;
        this.idUser = idUser;
        this.cardNumber = cardNumber;
        this.expiredate = expiredate;
        this.cvv = cvv;
        this.user_card = user_card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", idUser=" + idUser +
                ", cardNumber=" + cardNumber +
                ", expiredate=" + expiredate +
                ", cvv='" + cvv + '\'' +
                '}';
    }

}
