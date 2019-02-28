package factory.movable;

import factory.bases.Vehicle;

public class Bicycle extends Vehicle {

    public Bicycle() {
        super();
        setPassengers(1);
    }

    public Bicycle(double price) {
        super(price);
        setPassengers(1);
    }

    public Bicycle(double price, String brand, int passengers, double loadCapTon, double fuelCap, String fuelType, double fuelConsumption) {
        super(price, brand, passengers, loadCapTon, fuelCap, fuelType, fuelConsumption);
    }

    @Override
    protected double calculateExpenses() {
        return getPassengers() * 500;
    }
}
