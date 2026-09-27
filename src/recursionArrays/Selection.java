package recursionArrays;

import java.util.Arrays;

public class Selection {
    static void sort(int[] arr, int last, int col, int max) {
        if (last <= 0) {   // base case corrected
            return;
        }

        if (col <= last) {
            if (arr[col] > arr[max]) {
                sort(arr, last, col + 1, col);
            } else {
                sort(arr, last, col + 1, max);
            }
        } else {
            // swap max element with last element
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;

            // recurse for remaining array
            sort(arr, last - 1, 0, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 8, 9, 5, 6, 7};

        sort(arr, arr.length - 1, 0, 0);

        System.out.println(Arrays.toString(arr));
    }
}
