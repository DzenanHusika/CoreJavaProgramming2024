package five.zadaca;

public class ExerciseDemo {
    public static void main(String[] args) {
        String sentence = "Potraži riječ h ud  u   hudssshuds rečenici. Robin huud je hud   jer je veoma hud.";
        String targetWord = "hud";

        int targetWorkOccuranceCount = 0;
        int j = 0;

        for (int i = 0; i < sentence.length(); i += 1){
            int slovoRecenice = sentence.charAt(i);
            int slovoRijeci = targetWord.charAt(j);
            if (slovoRecenice != slovoRijeci){
                i = i - j;
                j = 0;
            }
            continue;
        }

        j++;
        if (j >= targetWord.length()){
            j = 0;
            targetWorkOccuranceCount++;
        }
        System.out.println(targetWorkOccuranceCount);
    }

}
