package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανιζει επαναληπτικα ενα μενου
 * επιλογων μεχρι ο χρηστης να επιλεξει
 * εξοδο.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. Εισαγωγή προϊόντος");
            System.out.println("2. Διαγραφή προϊόντος");
            System.out.println("3. Έξοδος");
            choice = in.nextInt();
        } while (choice != 3);
    }
}
