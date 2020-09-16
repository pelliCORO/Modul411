package bubbleSort;

import java.lang.reflect.Array;

public class BubbleSort {


    public static void main(String[] args) {
        sort();
    }

    /**
     * this methode sorts an Array ascending
     */
    public static void sort() {

        /**
         * Define and initialize int Array
         */
        int[] A = {9, 3, 4, 2, 5, 8, 6, 1, 7};

        /**
        * https://en.wikipedia.org/wiki/Bubble_sort
        */
        for (int i = 1; i < A.length; i++) {
            int value = A[i];
            int j = i;
            while (j > 0 && A[j - 1] > value) {
                A[j] = A[j - 1];
                j = j - 1;
                A[j] = value;
            }

        }

        /**
        * Prints result
        */
        for (int x = 0; x < A.length; x++) {
            System.out.print(A[x]);
        }

    }
}
