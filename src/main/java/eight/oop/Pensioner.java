package eight.oop;

import eight.oop.animal.Cat;
import eight.oop.animal.Dog;

import java.time.LocalDate;

public class Pensioner extends Person{
    private double pensionAmount;
    private Dog dog;
    private Cat cat;

    public Pensioner(String name, String surname, LocalDate birthDate, Gender gender, double pensionAmount){

    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }

    public double getPensionAmount() {
        return pensionAmount;
    }

    public void setPensionAmount(double pensionAmount) {
        this.pensionAmount = pensionAmount;
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "pensionAmount=" + pensionAmount +
                ", dog=" + dog +
                '}';
    }
}
