package eight.oop;

import eight.oop.animal.*;
import eight.oop.human.Child;
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
        Pensioner pensioner = new Pensioner("Andrej", "Grumić", LocalDate.of(2006, 7, 12), Gender.MALE, 2500);
        processPerson(pensioner);
        Dog lesi = new Dog("lesi");
        pensioner.setAnimal(lesi);
        processPerson(pensioner);
        Cat tom = new Cat("Tom");
        pensioner.setAnimal(tom);
        processPerson(pensioner);
        Hamster jerry = new Hamster("Jerry");
        pensioner.setAnimal(jerry);
        processPerson(pensioner);
        Fish fish = new Fish("Memo");
        pensioner.setAnimal(fish);
        processPerson(pensioner);
        Rabbit rabbit = new Rabbit("Duško");
        student.setAnimal(rabbit);

        Child child = new Child("Jovan", "Carević", LocalDate.of(1999, 1, 12), Gender.MALE);
            child.setAnimal(rabbit);
            processPerson(child);

            Snake python = new Snake("Python");
            pensioner.setAnimal(python);
            processPerson(pensioner);

            Turtle mikelandjelo = new Turtle("Mikelanđelo");
            employee2.setAnimal(mikelandjelo);
            processPerson(employee2);

    }

    private static void processPerson(Person person){
        System.out.println(person);
    }
}
