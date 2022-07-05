package it.itsrizzoli.auctive.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_product;

    @Size(min = 2, max = 255)
    @NotNull
    String product_name;

    @Size(max = 500)
    String product_description;

    @Size(min = 7, max = 256)
    @NotNull
    String product_image_url;

    @Size(min = 1 ,max = 50)
    String brand;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    Set<ProductUser> pu = new HashSet<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    Set<ProductCategory> pc = new HashSet<>();

    public Product() {
    }

    public Product(int id_product, String product_name, String product_description, String product_image_url, String brand, Set<ProductUser> pu, Set<ProductCategory> pc) {
        this.id_product = id_product;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_image_url = product_image_url;
        this.brand = brand;
        this.pu = pu;
        this.pc = pc;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public String getProduct_image_url() {
        return product_image_url;
    }

    public void setProduct_image_url(String product_image_url) {
        this.product_image_url = product_image_url;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Set<ProductUser> getPu() {
        return pu;
    }

    public void setPu(Set<ProductUser> pu) {
        this.pu = pu;
    }

    public Set<ProductCategory> getPc() {
        return pc;
    }

    public void setPc(Set<ProductCategory> pc) {
        this.pc = pc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id_product=" + id_product +
                ", product_name='" + product_name + '\'' +
                ", product_description='" + product_description + '\'' +
                ", product_image_url='" + product_image_url + '\'' +
                ", brand='" + brand + '\'' +
                ", pu=" + pu +
                ", pc=" + pc +
                '}';
    }
}
