package factory.movable;

import factory.bases.Vehicle;

public class Car extends Vehicle {

    public Car() {
    }

    public Car(double price) {
        super(price);
        setPassengers(5);
    }

    public Car(double price, String brand, int passengers, double loadCapTon, double fuelCap, String fuelType, double fuelConsumption) {
        super(price, brand, passengers, loadCapTon, fuelCap, fuelType, fuelConsumption);
    }

    @Override
    protected double calculateExpenses() {
        return getFuelConsumption() * getPassengers() * 500;
    }
}
