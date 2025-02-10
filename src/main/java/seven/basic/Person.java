package seven.basic;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private static int count = 0;

    private String name;
    private String surname;
    private LocalDate birthday;
    private Gender gender;

    public Person(){
        this("", "", LocalDate.now(), Gender.UNKNOWN);
    }

    public Person(String name, String surname, Gender gender){
        this(name, surname, LocalDate.now(), gender);
    }

    public Person(String name, String surname, LocalDate birthday){
        this(name, surname, birthday, Gender.UNKNOWN);
    }

    public Person(String name, String surname, LocalDate birthday, Gender gender){
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
        count++;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (gender.equals(Gender.UNKNOWN)){
            return;
        }
        this.gender = gender;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();//static func
        Period razmakvremenski = birthday.until(now);//instance func
        int years = razmakvremenski.getYears();//19
        int months = razmakvremenski.getMonths();//
        System.out.println("Godina: " + years+ " mjeseci " + months + " dana " + razmakvremenski.getDays());
        return years;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public static void printCounter(){

    }
}
