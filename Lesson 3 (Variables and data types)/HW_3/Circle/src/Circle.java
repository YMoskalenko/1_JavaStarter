import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        final double pi = Math.PI;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть радіус r:");
        float r = scanner.nextFloat();
        System.out.println("Площа кола з радіусом r: " + r + ", дорівнює: " + (float) (pi * Math.pow(r, 2)));
    }
}