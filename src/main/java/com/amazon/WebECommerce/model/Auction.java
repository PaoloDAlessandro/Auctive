package com.amazon.WebECommerce.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "auctions")
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "idProduct deve essere inserito")
    Long idProduct;

    @NotNull(message = "price deve essere inserita")
    Double price;

    @Size(min = 8, max = 500)
    @NotNull(message = "description deve essere inserita")
    String description;

    //category non c'è più


}
