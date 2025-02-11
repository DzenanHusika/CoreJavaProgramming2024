package eight.oop;

import eight.oop.animal.Cat;
import eight.oop.animal.Dog;
import eight.oop.human.Employee;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
//        Person person = new Person("Faruk", "Hodžić", LocalDate.of(2005, 5, 23), Gender.MALE);
//        String personString = person.toString();
        Employee employee1 = new Employee("Tarik", "Fejzić", LocalDate.of(2006, 6, 15), Gender.MALE, 4500.00);
        processPerson(employee1);
        Employee employee2 = new Employee("Tarik", "Bulić", LocalDate.of(1993, 5, 13), Gender.MALE, 5500.00);
        processPerson(employee2);
        //employee1 i employee2 : tip [Employee, Person, Object]
        // student : tip [Student, Person, Object]
        Student student = new Student("Faruk", "Hodžić", LocalDate.of(2005, 5, 23), Gender.MALE, "15055");
        processPerson(student);
        //pensioner: tip [Pensioner, Person, Object]
        Pensioner pensioner = new Pensioner("Andrej", "Grumić", LocalDate.of(2000, 7, 6), Gender.MALE, 2500.0);
        Dog lesi = new Dog("lesi");
        pensioner.setDog(lesi);
        processPerson(pensioner);
        Cat tom = new Cat("Tom");
        pensioner.setCat(tom);
        processPerson(pensioner);
    }

    private static void processPerson(Person person){
        System.out.println(person);
    }
}
