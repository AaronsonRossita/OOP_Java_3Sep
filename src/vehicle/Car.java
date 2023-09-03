package vehicle;

public class Car extends Vehicle{

    private Engine engine;

    public Car(int wheels, String model, Engine engine) {
        super(wheels, model);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
