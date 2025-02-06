package three.operator;
/*
Markirati dio koji želite zakomentirati:

 */
import javax.swing.*;
import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Enter second number: ");
        int number2 = new Scanner(System.in).nextInt();
        if (number1==23 || number1>=number2){
            System.out.println("Moj uslov je zadovoljen");
        }
        if (number2==23 && number1>=number2){
            System.out.println("Moj uslov je zadovoljen");
        }
    }
}
