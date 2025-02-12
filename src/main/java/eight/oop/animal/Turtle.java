package eight.oop.animal;

public class Turtle extends Animal{
    public Turtle(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Zvuk kornjace");
    }

    @Override
    public String species() {
        return "Kornjaca";
    }
}
