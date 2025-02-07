package five;

import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int[] brojevi = new int[11];
        Random random = new Random();
        for (int i = 0; i < brojevi.length; i++){
            int slucajanBroj = random.nextInt(100);
            brojevi[i] = slucajanBroj;
        }

        System.out.println("Unesi broj i okušaj sreću");
        String message = "";
        int pokušaj = 0;
        boolean pogodiliSte = false;
        while(pogodiliSte==false){
            pokušaj++;
            int unos = new Scanner(System.in).nextInt();
            for (int i = 0; i <brojevi.length; i++){
                int brojIzNiza = brojevi[i];
                if (brojIzNiza == unos){

                    message = "Pogodili ste iz " + pokušaj + ". puta";
                    break;
                }
            }

        }

    }
}
