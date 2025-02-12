package eight.oop.animal;

public class Hamster extends Animal{


    public Hamster(String name) {
        super(name);
    }

    @Override
    public String species() {
        return "Hrčak";
    }

    @Override
    public void playSound() {
        System.out.println("hrk");
    }
}
