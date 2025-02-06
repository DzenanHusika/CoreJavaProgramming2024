package four.loop;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        for (int i = 0; i < number; i++){
            System.out.println("Korak petlje: " + i);
        }
    }
}
