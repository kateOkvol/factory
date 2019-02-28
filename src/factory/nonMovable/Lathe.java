package factory.nonMovable;

import factory.bases.Machine;

public class Lathe extends Machine {
    private static final String MACHINING_SUBJECT = "details type body rotation";

    public Lathe() {
    }

    public Lathe(double price) {
        super(price);
    }

    public Lathe(double detailPerHour, Integer power) {
        super(detailPerHour, power);
    }

    public Lathe(double price, double detailPerHour, Integer power) {
        super(price, detailPerHour, power);
    }

    public Lathe(double price, String brand, double detailPerHour, Integer power) {
        super(price, brand, detailPerHour, power);
    }

    @Override
    protected void Does() {
        System.out.println("machining of " + MACHINING_SUBJECT);
    }

    @Override
    protected double calculateExpenses() {
        return getPower() * 300 + getStuff() * 800;
    }
}
