package model;

public class Airplane {

    private String model;
    private int numberOfSeats;
    private double maximumSpeed;
    private boolean active;

    public Airplane() {
    }

    public Airplane(String model, int numberOfSeats, double maximumSpeed, boolean active) {
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.maximumSpeed = maximumSpeed;
        this.active = active;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}
