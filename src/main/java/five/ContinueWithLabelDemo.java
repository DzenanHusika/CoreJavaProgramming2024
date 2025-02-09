package five;

public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String recenica = "hotraži huriječ hud u rečenici. Robin Hood je hud zato što prikuplja novce hud hud";
        String rijec = "hud";
        boolean jesteSadrzana = false;
        SKIPAJ: for (int i = 0; i < recenica.length(); i++){

            for (int j = 0; j < rijec.length(); j++){
                int k = i + j;
                char slovoIzRecenice = recenica.charAt(k);
                char slovoRijeci = rijec.charAt(j);
                if (slovoIzRecenice != slovoRijeci){
                    continue SKIPAJ;
                }
            }
            jesteSadrzana = true;
            break;
        }
        String message = jesteSadrzana ? "Riječ jeste sadržana": "Riječ nije sadržana";
        System.out.println(message);
    }
}
