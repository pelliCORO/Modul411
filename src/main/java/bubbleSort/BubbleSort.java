package bubbleSort;

import java.lang.reflect.Array;



public class BubbleSort {
    /**
     * https://en.wikipedia.org/wiki/Bubble_sort
     */


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
        int[] A = {0, 9, 4, 6, 2, 8, 5, 1, 7, 3};
        int n;
        int temp;
        int i, j;
        for (i = 0; i < A.length; i++){
            for ( j=0; j<A.length-1;j++){
                if (A[j]>A[j+1]) {

                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]= temp;

                    print(i, A);
                }
            }

        }


    }




    /**
    * Prints result
    */
        //for (int x = 0; x < A.length; x++) {
        //   System.out.print(A[x]);




    private static void print(int count, int[] a) {
        System.out.print(count + ": ");
        for (int value : a)
            System.out.print(value + " ");
        System.out.println();
    }

}

