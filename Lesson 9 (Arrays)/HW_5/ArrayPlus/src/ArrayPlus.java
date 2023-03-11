public class ArrayPlus {
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

        int[][] array3 = new int[3][3];

        System.out.println("Перший масив:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + array1[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("Другий масив:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + array2[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("Третій масив, що є сумою першого і другого:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
                System.out.print(" " + array3[i][j]);
            }
            System.out.print("\n");
        }
    }
}