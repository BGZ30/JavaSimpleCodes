/*
    Buble sort algorithm.
*/

public class BubbleSort {
    public static void main(String[] arg) {
        int[] arr = { 10, 50, 12, 1, 36, 0, 4, 78, 9, 5, 4, 12, 61, 13, 7, 3, 45, 12 };

        int temp;
        int alen = arr.length;

        for (int i = 0; i < alen; i++) {
            for (int j = 0; j < alen - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("The sorted array: ");
        for (int i = 0; i < alen; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}