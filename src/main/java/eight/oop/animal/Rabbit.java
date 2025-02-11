package eight.oop.animal;

public class Rabbit extends Animal{

    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("zec");
    }
}
