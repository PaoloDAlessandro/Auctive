package it.itsrizzoli.auctive.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "name deve essere inserito")
    String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    Set<productCategory> pc = new HashSet<>();

    public Category() {

    }

    public Category(int id, String name, Set<productCategory> pc) {
        this.id = id;
        this.name = name;
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

    public Set<productCategory> getPc() {
        return pc;
    }

    public void setPc(Set<productCategory> pc) {
        this.pc = pc;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pc=" + pc +
                '}';
    }
}
