package four.loop;

import javax.swing.*;
import java.util.Scanner;

/*
 * Petlja: blok koda koji se izvršava sve dok je zadovoljen uslov petlje
 *
 * while(IZRAZ koliko hoćete dugačak ali njegov rez mora biti TRUE/FALSE)
 * <p>
 *   while(uslov petlje){
 *
 * }
 * </p>
 */
public class WhileDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj");
        int number = new Scanner(System.in).nextInt();
        do {
            System.out.println("Unio si broj = " + number);
            number++;
        }while (number < 11);
    }
}
