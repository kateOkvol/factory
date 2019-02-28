package factory.bases;


public abstract class Machine extends Property {
    private double detailPerHour;
    private Integer power;

    public Machine() {
    }

    public Machine(double price) {
        super(price);
    }

    public Machine(double detailPerHour, Integer power) {
        this.detailPerHour = detailPerHour;
        this.power = power;
    }

    public Machine(double price, double detailPerHour, Integer power) {
        super(price);
        this.detailPerHour = detailPerHour;
        this.power = power;
    }


    public Machine(double price, String brand, double detailPerHour, Integer power) {
        super(price, brand);
        this.detailPerHour = detailPerHour;
        this.power = power;
    }

    public double getDetailPerHour() {
        return detailPerHour;
    }

    public void setDetailPerHour(double detailPerHour) {
        this.detailPerHour = detailPerHour;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    protected abstract void Does();
}
