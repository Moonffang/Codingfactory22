package gr.aueb.cf.ch4;

/**
 * Ένας μικρος βατραχος θελει να περασει ενα ποταμι.
 * Ο frog βρισκεται στη θεση χ και θελει να φτασει στη
 * θεση Υ (η σε θεση > Υ). The frog jumps a fixed distance, D.
 *
 * βρισκει το ελαχιστο αριθμο jumps που ο frog πρεπει
 * να κανει ωστε να φτασει (η να ξεπερασει) τον στοχο.
 *
 * πχ. Χ=10 Υ = 85 D = 30
 *
 * τοτε ο frog θα χρειαστει 3 jumps, γιατι:
 * Starts at 10, και μετα το 1ο jump παει στη θεση 10 + 30 = 40
 * Στο δευτερο jump, παει 40 +30 = 70
 * και στο 3ο jump, παει 70 + 30 = 100
 *
 */
public class FrogApp {

    public static void main(String[] args) {
        int x = 0;
        int y = 100;
        int d = 25;
        int jumps = 0;


        for (int i = x; i < y; i = i + d) {
            jumps++;
        }

        System.out.println("Least number of jumps = " + jumps);
    }
}