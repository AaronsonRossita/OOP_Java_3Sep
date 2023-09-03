package animals;

public class Cat extends Animal implements Walkable, Soundable{


    public Cat(String name) {
        super(name);
    }

    public void meow(){
        System.out.println("This cat is meowing");
    }

    @Override
    public void walk() {
        System.out.println("This cat is walking");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow, meow");
    }
}
