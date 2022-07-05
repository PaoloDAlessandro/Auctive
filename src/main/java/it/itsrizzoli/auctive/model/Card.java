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
    private Long id;

    @NotNull(message = "idUser deve essere inserito")
    Long idUser;

    @Size(min = 15, max = 19)
    @NotNull(message = "cardNumver deve essere inserito")
    Integer cardNumber;

    @NotNull(message = "expireDate deve essere inserito")
    Date expiredate;

    @NotNull(message = "cvv deve essere inserito")
    @Size(min = 3, max = 3)
    String cvv;

    public Card(Long id, Long idUser, Integer cardNumber, Date expiredate, String cvv) {
        this.id = id;
        this.idUser = idUser;
        this.cardNumber = cardNumber;
        this.expiredate = expiredate;
        this.cvv = cvv;
    }

    public Card() {

    }
}
