package gr.aueb.cf.ch6;

/**
 * Αναζητα ενα στοιχειο σε ενα πινακα.
 */

public class SecretArrayWithMethod {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int value = 6;
        int position = 0;
        position = getElementPosition(arr, value);
        System.out.println(position); //5
    }

    /**
     * Επιστρεφει το index του στοιχειου που αναζητα
     * η αν δεν το βρε επιστρεφει -1.
     *
     * @param arr   ο input array
     * @param value η τιμη που αναζηταμε
     * @return το index αν το στοιχειο βρεθει
     */
    public static int getElementPosition(int[] arr, int value) {
        if (arr == null) return -1;

        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                position = i;
                break;
            }
        }

        return position;
    }
}