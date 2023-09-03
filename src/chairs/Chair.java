package chairs;

public class Chair {

    private String  model;
    private int numberOfLegs;
    private double price;

    public Chair(String model, int numberOfLegs, double price) {
        this.model = model;
        this.numberOfLegs = numberOfLegs;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printChair(){
        System.out.println("This chair has " + numberOfLegs + " legs, model " + model + " and it costs " + price);
    }

    public double calculatePrice(int numberOfChairs){
        return price * numberOfChairs;
    }
}
