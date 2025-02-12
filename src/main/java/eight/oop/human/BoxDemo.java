package eight.oop.human;

import eight.oop.Person;

public class BoxDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jack");
        Box box = new Box();
        box.setField(person);

        Box<String> kutijaSaTekstom = new Box<>();
        kutijaSaTekstom.setField("Ovo je duži tekst");
    }
}
