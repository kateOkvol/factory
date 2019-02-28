package factory.nonMovable;

import factory.bases.Machine;

public class SmallMachine extends Machine {
    private String action;

    public SmallMachine() {
    }

    public SmallMachine(String action) {
        this.action = action;
    }

    public SmallMachine(double price) {
        super(price);
    }

    public SmallMachine(double detailPerHour, Integer power, String action) {
        super(detailPerHour, power);
        this.action = action;
    }

    public SmallMachine(double price, double detailPerHour, Integer power, String action) {
        super(price, detailPerHour, power);
        this.action = action;
    }

    public SmallMachine(double price, String brand, double detailPerHour, Integer power, String action) {
        super(price, brand, detailPerHour, power);
        this.action = action;
    }

    @Override
    protected double calculateExpenses() {
        return getStuff() * 300 + getPower() * 350;
    }

    @Override
    protected void Does() {
        System.out.println(this.action);
    }


}
