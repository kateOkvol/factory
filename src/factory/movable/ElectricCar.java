package factory.movable;

import factory.bases.Vehicle;

public class ElectricCar extends Vehicle {

    public ElectricCar() {
    }

    public ElectricCar(double price) {
        super(price);
        setPassengers(1);
    }

    public ElectricCar(double price, String brand, int passengers, double loadCapTon, double fuelCap, String fuelType, double fuelConsumption) {
        super(price, brand, passengers, loadCapTon, fuelCap, fuelType, fuelConsumption);
    }

    @Override
    protected double calculateExpenses() {
        return getFuelCap() * getPassengers() * 200;
    }
}
