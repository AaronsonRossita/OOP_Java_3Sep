package animals;

public class Bird extends Animal implements Flyable, Soundable{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("This bird is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("Chirp chirp");
    }
}
