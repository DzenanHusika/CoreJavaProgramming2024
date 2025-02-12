package eight.oop;

import eight.oop.animal.Animal;
import eight.oop.animal.Cat;
import eight.oop.animal.Dog;

import java.time.LocalDate;

public class Pensioner extends Person{
    private double pensionAmount;

    public Pensioner(String andrej, String grumić, LocalDate of, Gender gender, int i) {
    }

    public double getPensionAmount() {
        return pensionAmount;
    }

    public void setPensionAmount(double pensionAmount) {
        this.pensionAmount = pensionAmount;
    }

}
