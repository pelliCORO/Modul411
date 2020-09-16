package insertSort;

public class InsertSort {

    public static void main(String[] args) {
        sort();
    }

    public static void sort() {

        /**
         * Define and initialize int Array
         */
        int[] A = {0, 9, 4, 6, 2, 8, 5, 1, 7, 3};

        print(0, A);
        /**
        * https://de.wikipedia.org/wiki/Insertionsort
        */
        for (int i = 1; i < A.length; i++) {
            int einzusortierender_wert = A[i];
            int j = i;

            while (j > 0 && A[j - 1] > einzusortierender_wert) {
                A[j] = A[j - 1];
                j = j - 1;
                A[j] = einzusortierender_wert;
            }

            print(i, A);

        }


    }
    private static void print(int count, int[] a) {
        System.out.print(count + ": ");
        for (int value : a)
            System.out.print(value + " ");
        System.out.println();
    }
}
