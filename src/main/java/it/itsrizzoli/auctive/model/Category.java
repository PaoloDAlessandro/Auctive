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
    private int id_category;

    @NotNull(message = "category_name deve essere inserito")
    String category_name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    Set<ProductCategory> pc = new HashSet<>();

    public Category() {

    }

    public Category(int id_category, String category_name, Set<ProductCategory> pc) {
        this.id_category = id_category;
        this.category_name = category_name;
        this.pc = pc;
    }

    public int getid_category() {
        return id_category;
    }

    public void setid_category(int id_category) {
        this.id_category = id_category;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
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
                "id_category=" + id_category +
                ", category_name='" + category_name + '\'' +
                ", pc=" + pc +
                '}';
    }
}
