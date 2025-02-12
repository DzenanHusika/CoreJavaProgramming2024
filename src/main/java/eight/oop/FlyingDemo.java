package eight.oop;

import eight.oop.animal.Bird;
import eight.oop.animal.Flyable;
import eight.oop.human.Plane;

public class FlyingDemo {
    public static void main(String[] args) {
        Bird bird = new Bird("Soko");
        executeFlying(bird);
        Plane plane = new Plane();
        executeFlying(plane);
    }

    static void executeFlying(Flyable flyable){
        flyable.Fly();
    }
}
