package three.operator;

import javax.swing.*;
import java.awt.*;

/*
 * Java 1.7  ?
 *
 *  == -> kod složenih tipova poredi memorijske lokacije ne vrijednosti na toj lokaciji
 * .equals -> koristimo kod Stringa ako želimo uvjek da se radi
 */
public class ConditionDemo2 {
    public static void main(String[] args) {
//        String unesenoIme = JOptionPane.showInputDialog("Unesi Andrej").intern();
//        String result = "Andrej" == unesenoIme ? "Ti si unio Andrej": "Unesi Andrej";
//        JOptionPane.showMessageDialog(null, result);
//        System.out.println(result);
        String name = "Andrej";
        String name2 = new String( "Andrej").intern();
        String name3 = "Andrej";
        System.out.println(name == name2);
        System.out.println(name == name3);
        name3 = "Faruk";
        System.out.println(name == name3);
        System.out.println(name);
        System.out.println(name3);
    }
}
