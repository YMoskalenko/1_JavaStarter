import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {

        int n = 1, destination = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть кількість пунктів призначення");
        n = in.nextInt();
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                destination = destination * i;
            }
            System.out.println("Можлива кількість маршрутів довірнює: " + destination);
        } else
            System.out.println("Невірно введені дані, кількість маршрутів не може дорівнювати чи бути меншою 0");
    }
}