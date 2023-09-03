package vehicle;

public class Engine {

    private int cylinder;
    private double volume;

    public Engine(int cylinder, double volume) {
        this.cylinder = cylinder;
        this.volume = volume;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
