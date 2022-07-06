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
    private Integer idCard;

    @NotNull(message = "idUser deve essere inserito")
    int idUser;

    @Size(min = 15, max = 19)
    @NotNull(message = "cardNumver deve essere inserito")
    Integer cardNumber;

    @NotNull(message = "expireDate deve essere inserito")
    Date expireDate;

    @NotNull(message = "cvv deve essere inserito")
    @Size(min = 3, max = 3)
    String cvv;

    @ManyToOne
    @JoinColumn
    User userCard;

    public Card() {

    }

    public Card(Integer idCard, int idUser, Integer cardNumber, Date expireDate, String cvv, User userCard) {
        this.idCard = idCard;
        this.idUser = idUser;
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.userCard = userCard;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
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

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public User getUserCard() {
        return userCard;
    }

    public void setUserCard(User userCard) {
        this.userCard = userCard;
    }

    @Override
    public String toString() {
        return "Card{" +
                "idCard=" + idCard +
                ", idUser=" + idUser +
                ", cardNumber=" + cardNumber +
                ", expireDate=" + expireDate +
                ", cvv='" + cvv + '\'' +
                ", userCard=" + userCard +
                '}';
    }
}
