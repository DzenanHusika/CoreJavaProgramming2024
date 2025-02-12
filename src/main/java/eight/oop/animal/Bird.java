package eight.oop.animal;

public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("pi");
    }

    @Override
    public String species() {
        return "Ptica";
    }
}
