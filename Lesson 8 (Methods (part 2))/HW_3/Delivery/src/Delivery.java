import java.util.Scanner;

public class Delivery {
    public static int route(int n, int destination) {
        if ((n != 0) && (n > 0)) {
            for (int i = 1; i <= n; i++) {
                destination *= i;
            }
            System.out.println("Можлива кількість маршрутів довірнює: " + destination);
        } else
            System.out.println("Невірно введені дані, кількість маршрутів не може дорівнювати чи бути меншою 0");
        return destination;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 1, destination = 1;
        System.out.println("Введіть кількість пунктів призначення");
        n = in.nextInt();

        route(n, destination);

    }
}