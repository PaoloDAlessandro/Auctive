package it.itsrizzoli.auctive.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCategory;

    @NotNull(message = "category_name deve essere inserito")
    String categoryName;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    Set<ProductCategory> pc = new HashSet<>();

    public Category() {

    }

    public Category(Integer idCategory, String categoryName, Set<ProductCategory> pc) {
        this.idCategory = idCategory;
        this.categoryName = categoryName;
        this.pc = pc;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<ProductCategory> getPc() {
        return pc;
    }

    public void setPc(Set<ProductCategory> pc) {
        this.pc = pc;
    }

    @Override
    public String toString() {
        return "Category{" +
                "idCategory=" + idCategory +
                ", categoryName='" + categoryName + '\'' +
                ", pc=" + pc +
                '}';
    }
}
