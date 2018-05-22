package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items;
    private Item item;

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "NUMBERS")
    public String getNumber() {
        return number;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(
            name = "INVOICE_OF_PRODUCTS",
            joinColumns = {@JoinColumn(name = "ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "NUMBERS", referencedColumnName = "NUMBERS"),
                                  @JoinColumn(name = "ITEMS", referencedColumnName = "ITEMS")}
    )
    public List<Item> getItems() {
        getItems().add(item);
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
