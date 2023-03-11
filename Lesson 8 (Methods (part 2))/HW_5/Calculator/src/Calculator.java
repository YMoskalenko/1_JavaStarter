import java.util.Scanner;

public class Calculator {

    public static void trimToFive(int a) {
        System.out.println("a / 5 = " + a / 5);
    }

    public static void trimToFive(float b) {
        System.out.println("b / 5 = " + b / 5);
    }

    public static void trimToFive(double c) {
        System.out.println("c / 5 = " + c / 5);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введіть 3 числа: a,b,c (через Enter):");
        int a = in.nextInt();
        float b = in.nextFloat();
        double c = in.nextDouble();

        trimToFive(a);
        trimToFive(b);
        trimToFive(c);
    }
}