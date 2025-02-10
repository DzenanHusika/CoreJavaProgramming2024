package seven.concept;

import seven.basic.Gender;
import seven.concept.animal.*;
import seven.concept.human.Employee;
import seven.concept.human.Pensioner;
import seven.concept.human.Person;
import seven.concept.human.Student;

import java.time.LocalDate;

public class ConceptDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Emir");
        person.setSurname("Puška");
        person.setGender(Gender.MALE);
        person.setBirthday(LocalDate.of(1988,9,12));
        printPerson(person);
        System.out.println(person.toString());

        Employee employee = new Employee();
        employee.setName("Andrej");
        employee.setSurname("Grumić");
        employee.setGender(Gender.MALE);
        employee.setBirthday(LocalDate.of(2000,7,6));
        employee.setSalary(6999);
        printPerson(employee);
        System.out.println(employee.toString());

        Student student = new Student();
        student.setName("Tarik");
        student.setSurname("Bulić");
        student.setGender(Gender.MALE);
        student.setBirthday(LocalDate.of(1993, 5, 13));
        student.setIndexNumber("15XX2323");
        printPerson(student);
        System.out.println(student.toString());

        Pensioner pensioner = new Pensioner();
        pensioner.setName("Azur");
        pensioner.setSurname("Bulić");
        pensioner.setBirthday(LocalDate.of(2003, 3, 13));
        pensioner.setGender(Gender.MALE);
        pensioner.setPension(900);
        printPerson(pensioner);
        System.out.println(pensioner.toString());

        Animal dog = new Dog("Lesi");
        Animal cat = new Cat("Mici");
        Animal rabbit = new Rabbit("Maki");
        Animal hamster = new Hamster("Hrki");
        playAnimalSound(dog);
        playAnimalSound(cat);
        playAnimalSound(rabbit);
        playAnimalSound(hamster);

    }

    private static void playAnimalSound(Animal animal){

    }


    private static void printPerson(Person person){
        System.out.println(person.getName() + " "+ person.getSurname()+ ", "+ person.getBirthday());
    }
}
