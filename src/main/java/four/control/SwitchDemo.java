package four.control;

import javax.swing.*;

public class SwitchDemo {
    public static void main(String[] args) {
       String userDayInput = JOptionPane.showInputDialog("Unesite naziv dana u sedmici na Engleskom jeziku");
       int numberOfDayWithinWeek = 1;
       switch (userDayInput){
           case "Monday":
               numberOfDayWithinWeek = 1;
               break;
               case "Tuesday":
                   numberOfDayWithinWeek = 2;
                   break;
           case "Wednesday":
                   numberOfDayWithinWeek = 3;
                   break;
           case "Thursday":
                   numberOfDayWithinWeek = 4;
                   break;
           case "Friday":
                   numberOfDayWithinWeek = 5;
                   break;
           case "Saturday":
                   numberOfDayWithinWeek = 6;
                   break;
           case "Sunday":
                   numberOfDayWithinWeek = 7;
               break;
           default:
               numberOfDayWithinWeek = 0;
               break;
       }

       String message = "Za uneseni naziv dana u sedmici na engleskom jeziku" + userDayInput + " redni broj dana u sedmici je" + numberOfDayWithinWeek;
    }
}