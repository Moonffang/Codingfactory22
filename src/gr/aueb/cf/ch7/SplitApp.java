package gr.aueb.cf.ch7;

public class SplitApp {

    public static void main(String[] args) {
        String s = "Athens Uni of Econ and Bus";

        String[] tokens; tokens = s.split(" +");

        for (String token : tokens) {
            System.out.print(token); System.out.print(" ");
        }
    }
}