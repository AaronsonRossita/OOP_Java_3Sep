package vehicle;

public class Vehicle {

    private int wheels;
    private String model;

    public Vehicle(int wheels, String model) {
        this.wheels = wheels;
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
