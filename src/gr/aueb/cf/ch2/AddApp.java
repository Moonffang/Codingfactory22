package gr.aueb.cf.ch2;

/**
 * Overflow.
 */
public class AddApp {

    public static void main(String[] args) {
        long num1 = 2_147_483_647;
        long num2 = 2;
        long result;

        result = num1 + num2;

        System.out.println("Sum: " + result);
    }
}
