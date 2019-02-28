package factory.bases;

import java.util.ArrayList;

public abstract class Property implements Goods{
    private String brand;
    private double mass;
    private double price;
    private Integer stuff;

    Property() {
    }

    Property(double price) {
        this.price = price;
    }

    Property(double price, String brand) {
        this.brand = brand;
        this.price = price;
    }

    public Property(double price, Integer stuff) {
        this.price = price;
        this.stuff = stuff;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getStuff() {
        return stuff;
    }

    public void setStuff(Integer stuff) {
        this.stuff = stuff;
    }

    @Override
    public double sumPrice(ArrayList<Property> list) {
        double sum = 0;
        for (Property p : list) {
            sum += p.getPrice();
        }
        return sum;
    }

    @Override
    public Integer stuffNumber(ArrayList<Property> list) {
        Integer number = 0;
        for (Property p : list) {
            number += p.getStuff();
        }
        return number;
    }

    protected abstract double calculateExpenses();
}
