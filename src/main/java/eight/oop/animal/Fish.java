package eight.oop.animal;

public class Fish extends Animal{

    public Fish(String name) {
        super(name);
    }

    @Override
    public String species() {
        return "Riba";
    }

    @Override
    public void playSound() {
        System.out.println("blb");
    }
}
