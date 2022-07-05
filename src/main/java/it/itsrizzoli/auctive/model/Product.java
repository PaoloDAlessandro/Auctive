package it.itsrizzoli.auctive.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Size(min = 2, max = 255)
    @NotNull
    String name;

    @Size(max = 500)
    String description;

    @Min(1)
    @Max(20)
    @NotNull
    Integer quantity;

    @Size(min = 7, max = 256)
    @NotNull
    String urlImage;

    @Size(min = 1 ,max = 50)
    String brand;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    Set<productUser> pu = new HashSet<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    Set<productCategory> pc = new HashSet<>();

    public Product() {
    }

    public Product(int id, String name, String description, Integer quantity, String urlImage, String brand, Set<productUser> pu, Set<productCategory> pc) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.urlImage = urlImage;
        this.brand = brand;
        this.pu = pu;
        this.pc = pc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Set<productUser> getPu() {
        return pu;
    }

    public void setPu(Set<productUser> pu) {
        this.pu = pu;
    }

    public Set<productCategory> getPc() {
        return pc;
    }

    public void setPc(Set<productCategory> pc) {
        this.pc = pc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", urlImage='" + urlImage + '\'' +
                ", brand='" + brand + '\'' +
                ", pu=" + pu +
                ", pc=" + pc +
                '}';
    }
}
