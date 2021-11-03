package Principios.Encapsulamiento.Clase.Clase;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items = new ArrayList<>();
    private String country;
    private TaxCalculator taxCalculator;

    public Order(String country) {
        this.country = country;
        this.taxCalculator = new TaxCalculator();
    }

    public double getTotal() {
        double total = 0;

        for (Item item: items) {
            total += item.getPrice() * item.getQuantity();
        }

        total += total * taxCalculator.getTaxRate(country);

        return total;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}