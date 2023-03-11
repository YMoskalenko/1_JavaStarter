import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для знаходження середнього арифметичного введіть число а: ");
        byte a = scanner.nextByte();
        System.out.println("число b: ");
        byte b = scanner.nextByte();
        System.out.println("число c: ");
        byte c = scanner.nextByte();
        float x = (float) (a + b + c) / 2;
        System.out.println("Середнє арифметичне чисел a, b, c дорівнює: " + x);
    }
}