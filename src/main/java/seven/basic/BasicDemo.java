package seven.basic;

import javax.sound.sampled.FloatControl;
import java.time.LocalDate;

public class BasicDemo {
    public static void main(String[] args) {
//Zašto sam kreirao konstruktore?
        Person.printCounter();
        Person person = new Person();
        person.printCounter();
        Person person2 = new Person("Tarik", "Fejzić", Gender.MALE);
        person2.printCounter();

        person2.setSurname("Momačko Ženino");
        Person person3 = new Person("Faruk", "Hodžić", LocalDate.of(2005, 5, 23));
        person3.printCounter();
        System.out.println(person3.getName()+ " ima " + person3.getAge() + " godina");
    }
}
