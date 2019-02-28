package factory.movable;

import factory.bases.Vehicle;

public class RoboticTrolley extends Vehicle {

    public RoboticTrolley() {
    }

    public RoboticTrolley(double price) {
        super(price);
        setPassengers(0);
    }


    public RoboticTrolley(double price, String brand, int passengers, double loadCapTon, double fuelCap, String fuelType, double fuelConsumption) {
        super(price, brand, passengers, loadCapTon, fuelCap, fuelType, fuelConsumption);
    }

    @Override
    protected double calculateExpenses() {
        return getPrice() + getFuelCap() * 100;
    }
}
