package four.array;

import java.util.Random;
import java.util.Scanner;

/*
 * Puštate korisnika da unese broj.
 * Nakon toga nudite korisniku neku nagradu ako je uneseni broj sadržan u nizu 'brojevi'.
 * Ukoliko nije onda mu kažete da uplati ponovo i pokuša ponovno.
 * Modifikovati zadatak tako da vrijednosti elementa u nizu 'brojevi' na svako
 * startanje programa budu različite.
 * Vrijednost elementa treba da bude broj od 0-1000.
 * Random randGenerator = new Random();
 * int slucajniBroj = random.nextIn(1000);
 */
public class BreakUpgradeDemo {
    public static void main(String[] args) {
        int[] brojevi = new int[11];
        Random random = new Random();
        for (int i = 0; i < brojevi.length; i++) {
            int slucajniBroj = random.nextInt(1000);
            brojevi[i] = slucajniBroj;
            System.out.println(brojevi[i]);
        }

        System.out.println("Unesi broj i okušaj sreću");
        int uneseniBroj = new Scanner(System.in).nextInt();
        String message = "";
        for (int i = 0; i < brojevi.length; i++) {
            int broj = brojevi[i];
            if (broj == uneseniBroj) {
                message = "Pogodili ste...";
                break;
            }
        }
    }
}
