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
    private Integer idProduct;

    @Size(min = 2, max = 255)
    @NotNull
    String productName;

    @Size(max = 500)
    String productDescription;

    @Size(min = 7, max = 256)
    @NotNull
    String productImageUrl;

    @Size(min = 1 ,max = 50)
    String brand;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    Set<ProductUser> pu = new HashSet<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    Set<ProductCategory> pc = new HashSet<>();

    public Product() {
    }

    public Product(Integer idProduct, String productName, String productDescription, String productImageUrl, String brand, Set<ProductUser> pu, Set<ProductCategory> pc) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productImageUrl = productImageUrl;
        this.brand = brand;
        this.pu = pu;
        this.pc = pc;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
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
                "idProduct=" + idProduct +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productImageUrl='" + productImageUrl + '\'' +
                ", brand='" + brand + '\'' +
                ", pu=" + pu +
                ", pc=" + pc +
                '}';
    }
}
