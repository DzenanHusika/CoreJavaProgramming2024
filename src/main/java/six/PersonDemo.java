package six;

import six.oop.Person;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Dženita", "Kovačević");
        person.setName("Dženita");
        person.setSurname("Kovačević");
        person.setAge(21);
        System.out.println(person);

        Person person2 = new Person("Azur", "Bulić");
        person2.setName("Azur");
        person2.setSurname("Bulić");
        person2.setAge(23);
        System.out.println(person);

        Person person3 = new Person("Andrej", "Grumić");
        person3.setAge(-23);
        System.out.println(person3);
    }
}
