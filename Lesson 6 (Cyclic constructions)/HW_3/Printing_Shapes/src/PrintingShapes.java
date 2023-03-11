public class PrintingShapes {
    public static void main(String[] args) {

        // Прямокутник 4 на 20
        System.out.println("\nПрямокутник 4 на 20");
        for (int i = 0; i < 4; i++) {
            // Виводимо один рядок із 20 зірочок.
            for (int j = 0; j < 20; j++) {
                System.out.print("%");
            }
            System.out.println("");
        }
        // Прямокутний трикутник
        System.out.println("\nПрямокутний трикутник");
        for (int i = 1; i <= 9; i += 2) {
            for (int k = 9; k >= i; k -= 2) {
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("%");
            }
            System.out.println();
        }

        // Рівносторонній трикутник
        System.out.println("\nРівносторонній трикутник");
        for (int i = 1; i <= 9; i += 2) {
            for (int k = 9; k >= i; k -= 2) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" %");
            }
            System.out.println();
        }
        // Ромб верх
        System.out.println(" \n Ромб");
        for (int i = 1; i <= 5; i += 2) {
            for (int k = 5; k >= i; k -= 2) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" %");
            }
            System.out.println();
        }
        for (int j = 1; j <= 7; j++) {
            System.out.print(" %");
        }
        System.out.print("\n");
        // Низ
        for (int i = 1; i <= 5; i += 2) {
            for (int k = 1; k <= i; k += 2) {
                System.out.print("  ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(" %");
            }
            System.out.println();
        }
    }
}