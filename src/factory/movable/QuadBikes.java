package factory.movable;

import factory.bases.Vehicle;

public class QuadBikes extends Vehicle {

    public QuadBikes() {
    }

    public QuadBikes(double price) {
        super(price);
        setPassengers(1);
    }


    public QuadBikes(double price, String brand, int passengers, double loadCapTon, double fuelCap, String fuelType, double fuelConsumption) {
        super(price, brand, passengers, loadCapTon, fuelCap, fuelType, fuelConsumption);
    }

    @Override
    protected double calculateExpenses() {
        return getFuelConsumption() * 250;
    }
}
