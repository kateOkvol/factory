package factory.movable;

import factory.bases.Vehicle;

public class Truck extends Vehicle {

    public Truck() {
    }

    public Truck(double price) {
        super(price);
        setPassengers(2);
    }

    public Truck(double price, String brand, int passengers, double loadCapTon, double fuelCap, String fuelType, double fuelConsumption) {
        super(price, brand, passengers, loadCapTon, fuelCap, fuelType, fuelConsumption);
    }

    @Override
    protected double calculateExpenses() {
        return getPrice() + getPassengers() * 500 + getFuelConsumption() * 20d;
    }
}
