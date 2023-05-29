package gr.aueb.cf.ch6;

public class MissingArrayElement {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2};
        int missing = -1;

        for (int i = 1; i <= arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missing = i;
                break;
            }
        }

        if (missing != -1) {
            System.out.println("The missing number is " + missing);
        } else {
            System.out.println("No number is missing from the array");
        }
    }
}