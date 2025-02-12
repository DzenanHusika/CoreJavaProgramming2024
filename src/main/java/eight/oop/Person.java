package eight.oop;

import eight.oop.animal.Animal;

import java.time.LocalDate;
import java.time.Period;

/*
 * Klasa može imati:
 * <1> Polja </i>
 * <i>static</i>
 * <i>instancna ili objektna</i>
 *  </1.>
 *  <2>
 *      Konstruktor
 *  </2>
 *  <3.>
 *    <i> Funkcije instance -> person.setName("Tarik");</i>
 *    <ii>Funkcija static -> main Demo.main, Person.setCounter();</ii>
 *  </3.>
 *  <4.>
 *      Ugniježdene klase
 *      <i> STATIC </i>
 *      <ii>instance</ii>
 *  </  4.>
 *
 */
public class Person extends Object{
    private String name;
    private String surname;
    private LocalDate birthDate;
    private Gender gender;
    private Animal animal;



    public Person(){
        System.out.println("Person Constructor");
    }

    public Person(String name, String surname, LocalDate birthDate, Gender gender){
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public int getAge(){
        Period period = birthDate.until(LocalDate.now());
        int years = period.getYears();
        return years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String text = name + " " + surname + " " + birthDate + " " +  gender + " star " + getAge() + " godina";
        if (animal!= null){
            text = text + " i ima " + animal.species() + " sa imenom " + animal.getName();
        }
        return text;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
