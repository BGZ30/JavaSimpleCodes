/*
    Selection sort algorithm.
*/

public class SelectionSort {
    public static void main(String[] arg) {
        int[] arr = { 10, 50, 12, 1, 36, 0, 4, 78, 9, 5, 4, 12, 61, 13, 7, 3, 45, 12 };

        int min, minI;
        int alen = arr.length;

        for (int i = 0; i < alen; i++) {
            min = arr[i];
            minI = i;

            for (int j = i; j < alen; j++) {
                if (arr[j] < min) {
                    minI = j;
                }
            }

            min = arr[minI];
            arr[minI] = arr[i];
            arr[i] = min;
        }

        System.out.print("The sorted array: ");
        for (int i = 0; i < alen; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}