package three.flow;

import javax.swing.*;
import java.util.Scanner;

/*
 * Kao ulaz u program korisnik unosi redni broj dana u sedmici.
 * Kao rezultat program ispisuje ime dana na Njemačkom jeziku.
 *
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("Unesi redni broj dana u sedmici:");
        int redniBroj = new Scanner(System.in).nextInt();
        String dayNames="";
        switch(redniBroj){
            case 1:
                dayNames = dayNames + "Montag";
            case 2:
                dayNames = dayNames + "Dienstg";
            case 3:
                dayNames = dayNames + "Mittwoch";
            case 4:
                dayNames = dayNames + "Donnerstag";
            case 5:
                dayNames = dayNames + "Freitag";
            case 6:
                dayNames = dayNames + "Samstag";
            case 7:
                dayNames = dayNames + "Sontag";
                break;
            default:
                dayNames = dayNames + "Sedmica ima 7 dana. Unesi broj između 1-7";
                break;
        }
        System.out.println(dayNames);
        JOptionPane.showMessageDialog(null, dayNames);
    }
}
