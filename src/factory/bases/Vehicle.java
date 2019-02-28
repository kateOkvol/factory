package factory.bases;

public abstract class Vehicle extends Property {
    private int passengers;
    private double loadCapTon;
    private double fuelCap;
    private String fuelType;
    private double fuelConsumption;

    public Vehicle() {
    }

    public Vehicle(double price) {
        super(price);
    }


    public Vehicle(double price, String brand, int passengers, double loadCapTon, double fuelCap, String fuelType, double fuelConsumption) {
        super(price, brand);
        this.passengers = passengers;
        this.loadCapTon = loadCapTon;
        this.fuelCap = fuelCap;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getLoadCapTon() {
        return loadCapTon;
    }

    public void setLoadCapTon(double loadCapTon) {
        this.loadCapTon = loadCapTon;
    }

    public double getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(double fuelCap) {
        this.fuelCap = fuelCap;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
