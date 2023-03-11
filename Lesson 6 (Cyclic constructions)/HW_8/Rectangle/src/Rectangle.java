import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("\b Введіть висоту прямокутнику h: ");
        int h = in.nextInt();
        System.out.print("\b Введіть довжину прямокутнику l: ");
        int l = in.nextInt();
        // Прямокутник h на l
        System.out.println("\n Прямокутник " + h + " на " + l);
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}