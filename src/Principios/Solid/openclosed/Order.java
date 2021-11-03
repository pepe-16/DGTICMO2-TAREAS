package Principios.Solid.openclosed;

import java.util.ArrayList;

public class Order
{
    private ArrayList<Item> items = new ArrayList<>();
    private String country;
    private Shipping shipping;

    public Order(String country, Shipping shipping) {
        this.country = country;
        this.shipping = shipping;
    }

    public double getTotal() {
        double total = 0;

        for (Item item: items) {
            total += item.getPrice() * item.getQuantity();
        }

        total += total * getTaxRate();

        return total;
    }

    public double getTotalWeight() {
        double weight = 0;

        for (Item item: items) {
            weight += item.getWeight();
        }

        return weight;
    }

    public double getShippingCost() {
        return shipping.getCost(this);
    }

    public double getTaxRate() {
        if (country == "MX") {
            return 0.16;
        }
        else if (country == "US") {
            return 0.07;
        }
        else if (country == "EU") {
            return 0.20;
        }
        else {
            return 0;
        }
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

    public Shipping getShipping()
    {
        return shipping;
    }

    public void setShipping(Shipping shipping)
    {
        this.shipping = shipping;
    }
}