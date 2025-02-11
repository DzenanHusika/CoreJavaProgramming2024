package eight.oop.human;

import eight.oop.Gender;
import eight.oop.Person;

import java.time.LocalDate;

public class Employee extends Person {
    private double salaryAmount;

    public Employee(String name, String surname, LocalDate birthDate, Gender gender, double salaryAmount){
        super(name, surname, birthDate, gender);
        this.salaryAmount = salaryAmount;
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
