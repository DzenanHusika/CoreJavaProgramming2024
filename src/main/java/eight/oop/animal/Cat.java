package eight.oop.animal;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String species() {
        return "Mačka";
    }

    @Override
    public void playSound() {
        System.out.println("mjau");
    }
}
