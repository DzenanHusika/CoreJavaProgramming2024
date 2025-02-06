package three.flow;

import javax.swing.*;
import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        System.out.println("Unesi redni brorj mjeseca u godini");
       int month = new Scanner(System.in).nextInt();
        System.out.println("Unesi godinu");
        int year = new Scanner(System.in).nextInt();

        int numbersOfDaysInMonth;
        switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numbersOfDaysInMonth = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numbersOfDaysInMonth = 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                        numbersOfDaysInMonth = 29;
                    } else {
                        numbersOfDaysInMonth = 28;
                    }
                    break;
                default:
                    numbersOfDaysInMonth = 0;
            }
            String message = "Broj dana u mjesecu je " + numbersOfDaysInMonth;
            JOptionPane.showMessageDialog(null, message);
        }
    }