package three.flow;

import javax.swing.*;

public class ifElseDemo {
    public static void main(String[] args) {
        int points = Integer.parseInt(JOptionPane.showInputDialog("Broj poena koje je student ostvario na ispitu"));
        char rezultat = 'F';  // Default value in case points < 50

        if (points >= 90) {
            rezultat = 'A';
        } else if (points >= 80) {
            rezultat = 'B';
        } else if (points >= 70) {
            rezultat = 'C';
        } else if (points >= 60) {
            rezultat = 'D';
        }

        String message = "Score na ispitu je: " + rezultat;
        JOptionPane.showMessageDialog(null, message);
    }
}