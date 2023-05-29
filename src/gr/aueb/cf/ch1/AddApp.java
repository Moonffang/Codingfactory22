package gr.aueb.cf.ch1;

/**
 * Προσθέτει δυο ακεραιους
 * και εμφανιζει το αποτελεσμα
 * στο stout.
 */
public class AddApp {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποιηση μεταβλητων
        int num1 = 10;
        int num2 = 7;
        int result = 0;

        //εντολές
        result = num1 + num2;

        //Εκτυπωση αποτελεσματων
        System.out.println("Το αποτέλεσμα  είναι: " + result);
        System.out.printf("Το αποτέλεσμα των %d , %d είναι %d", num1, num2, result);
    }
}
