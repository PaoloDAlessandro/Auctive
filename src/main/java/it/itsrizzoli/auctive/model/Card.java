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

    @Size(min=2, max=50, message = "Nome deve essere tra 2 e 50 caratteri")
    @NotNull
    String nameUserCard;

    @Size(min=2, max=50, message = "Cognome deve essere tra 2 e 50 caratteri")
    @NotNull
    String surnameUserCard;

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

    public Card(String nameUserCard, String surnameUserCard, Integer cardNumber, Date expireDate, String cvv) {
        this.nameUserCard = nameUserCard;
        this.surnameUserCard = surnameUserCard;
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.cvv = cvv;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getNameUserCard() {
        return nameUserCard;
    }

    public void setNameUserCard(String nameUserCard) {
        this.nameUserCard = nameUserCard;
    }

    public String getSurnameUserCard() {
        return surnameUserCard;
    }

    public void setSurnameUserCard(String surnameUserCard) {
        this.surnameUserCard = surnameUserCard;
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
                ", nameUserCard='" + nameUserCard + '\'' +
                ", surnameUserCard='" + surnameUserCard + '\'' +
                ", cardNumber=" + cardNumber +
                ", expireDate=" + expireDate +
                ", cvv='" + cvv + '\'' +
                ", userCard=" + userCard +
                '}';
    }
}
