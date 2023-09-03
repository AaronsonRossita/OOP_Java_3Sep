import animals.*;
import vehicle.Car;
import vehicle.Engine;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Chair c = new Chair("Red",4,25.5);
//        OfficeChair oc1 = new OfficeChair("Blue",1,50,true,true,false,0);
//        OfficeChair oc2 = new OfficeChair("Blue",1,50,true,true,true,20);
//
//        System.out.println(oc1.calculatePrice(2));
//        System.out.println(oc2.calculatePrice(2));

        Bird bird = new Bird("Yago");
        Cat cat = new Cat("Tom");
        Dog dog = new Dog("Spike");

        Plane plane = new Plane();
//        bird.fly();
//        cat.walk();
//        dod.walk();

//        makeThemFly(bird);
//        makeThemFly(plane);
//
//        makeThemWalk(cat);
//        makeThemWalk(dog);

//        makeThemMakeNoise(bird);
//        makeThemMakeNoise(cat);
//        makeThemMakeNoise(dog);

        RegularUser user1 =  new RegularUser(1,"Tom", LocalDate.now());
        VIPUser user2 = new VIPUser(2,"Jack",15,LocalDate.of(1989,10,2));

//        user1.printName();
//        user2.printName();

        Engine engine = new Engine(8,2.0);
        Car car = new Car(4,"Kia",new Engine(6,1.6));



    }

    public static void makeThemFly(Flyable f){
        f.fly();
    }

    public static void makeThemWalk(Walkable w){
        w.walk();
    }

    public static void makeThemMakeNoise(Soundable s){
        s.makeNoise();
    }


    public static ArrayList<Boolean> compareTwoCollections(ArrayList<String> x, ArrayList<String> y){
        ArrayList<String> bigger;
        ArrayList<String> smaller;
        ArrayList<Boolean> result = new ArrayList<>();
        if(x.size() > y.size() || x.size() == y.size()){
            bigger = x;
            smaller = y;
        }else{
            bigger = y;
            smaller = x;
        }

        for (int i = 0; i < bigger.size(); i++) {
            result.add(smaller.contains(bigger.get(i)));
        }
        return result;
    }


}