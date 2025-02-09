package five;

import javax.sound.midi.MidiFileFormat;

public class ContinueDemo {
    public static void main(String[] args) {
        String recenica = "Petar Pan je pojeo paprike. Pohvalio se kako može paprika puno pojest.";
        char[] slovaRecenice = recenica.toCharArray();
        char slovo = 'p';
        int brojPojavljivanjaSlovaP = 0;
        for (int j = 0; j < slovaRecenice.length; j++){
            char znakIzRecenice = slovaRecenice[j];
            if (znakIzRecenice != slovo){
                continue;
            }
            brojPojavljivanjaSlovaP++;
        }
        System.out.println("Slovo 'p' se nalazi u rečenici " + brojPojavljivanjaSlovaP + " puta");

    }
}
