package three.operator;

import javax.swing.*;
import java.util.Scanner;

/*
* SHIFT + FN + F6
*
* Operatori poređenja
* <li> == equality </li>
* <li></li>
* <li></li>
* <li></li>
* <li></li>
* <li></li>
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvu cjelobrojnu vrijednost");
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvu cjelobrojnu"));
        System.out.println("Unesi drugu cjelobrojnu vrijednost");
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugu cjelobrojnu"));
        if(number1 == number2){
            System.out.println("Jednaki brojevi");
        }
        if (number1 !=  number2){
            System.out.println("Nejednaki brojevi");
        }
        if (number1>number2){
            System.out.println("Prvi veći od drugog");
        }
        if (number1>=number2){
            System.out.println("Prvi veći ili jednak drugom");
        }
        if (number1<number2){
            System.out.println("Prvi manji od drugog");
        }
        if (number1<=number2){
            System.out.println("Prvi manji ili jednak drugom");
        }
    }
}
