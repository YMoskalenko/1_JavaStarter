public class ArraysPlusMetod {

    private static int[][] add(int[][] array1, int[][] array2) {
        int[][] array3 = new int[3][3];
        System.out.println("Третій масив:");
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
                System.out.print(" " + array3[i][j]);
            }
            System.out.print("\n");
        }
        return array3;
    }

    public static void main(String[] args) {
        int[][] array1 = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };
        int[][] array2 = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };

        System.out.println("Перший масив:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(" " + array1[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("Другий масив:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.print(" " + array2[i][j]);
            }
            System.out.print("\n");
        }
        add(array1, array2);
    }
}