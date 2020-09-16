package mehrDimensionalesArray;

public class matrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {4, 5, 6},
                {2, -9, -3}
        };

        int[][] pascal = {
                {1},
                {1, 1},
                {1, 2, 1},
                {1, 3, 3, 1},
                {1, 4, 6, 4, 1}
        };

        for (int[] vector : matrix) {
            for (int value : vector) {
                System.out.print(value + "\t");
            }
            System.out.println();

        }

        System.out.println();

        for (int[] vector : pascal) {
            for (int value : vector) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}

