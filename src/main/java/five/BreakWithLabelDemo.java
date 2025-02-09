package five;

import java.util.Scanner;

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int[][] numbers = {
                {23, 12, 34, 99},
                {12, 1076, 32323,  12},
                {622, 345, 212, 90}
        };
        System.out.println("Unesi broj i okušaj sreću");
        int unos = new Scanner(System.in).nextInt();
        VANJSKA: for (int i = 0; i< numbers.length; i++){
            int[] niz = numbers[i];
            for (int j = 0; j < niz.length; j++){
               int brojIzNiza = numbers[i][j];
               int brojIzNiza2 = niz[j];
               if (unos == brojIzNiza){
                   System.out.println("Pogodili ste i vaš broj se nalazi na poziciji [" + i + "." + j + "] u našem nizu");

                   break;
               }
            }
        }
    }
}
