package animals;

public class Dog extends Animal implements Walkable, Soundable{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("This dog is walking");
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof, woof");
    }
}
