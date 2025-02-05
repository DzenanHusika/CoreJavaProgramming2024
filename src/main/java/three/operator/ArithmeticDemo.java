package three.operator;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
Aritmetički operatori:
<li>1. + Additive operator </li>
<li>2. - Subtraction operator</li>
<li>3. * Multiplication operator</li>
<li>4. / Division operator</li>
<li>5. % Remainder operator</li>
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj: ");
        int number2 = new Scanner(System.in).nextInt();
        int suma = number1 + number2;
        System.out.println("Vaš rezultat je: " + suma);
        int razlika = number1 - number2;
        System.out.println("Razlika: " + razlika);
        int product = number1*number2;
        System.out.println("Product: " + product);
        int division = number1/number2;
        System.out.println("Division: " + division);
        int remainder = number1%number2;
        System.out.println("Remainder: " + remainder);
    }
}
