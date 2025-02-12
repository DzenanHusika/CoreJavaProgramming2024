package eight.oop.human;

import eight.oop.Gender;
import eight.oop.Person;

import java.time.LocalDate;

public class Child extends Person {

    public Child(String name, String surname, LocalDate birthdate, Gender gender){
        super(name, surname, birthdate, gender);
    }
}
