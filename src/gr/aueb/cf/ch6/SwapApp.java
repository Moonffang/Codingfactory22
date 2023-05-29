package gr.aueb.cf.ch6;

public class SwapApp {

    public static void main(String[] args) {
        int[] arr = {1, 10};
        swap(arr);

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void swap(int[] arr) {
        if (arr == null || arr.length != 2) return;

        int tmp =arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}