import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть число N, для розрахунку послідовності");
        int n = in.nextInt();

        int factorial = 1;
        double sum = 0;
        double sum1 = 0;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += 1.0 / factorial;
            sum1 = 1 + sum;
        }
        System.out.println("Відповідь розрахунку: " + sum1);
    }
}