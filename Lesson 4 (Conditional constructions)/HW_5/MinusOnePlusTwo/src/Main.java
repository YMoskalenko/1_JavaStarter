import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть число");

        int digit = in.nextInt();

        if (digit > 0) {
            digit = digit + 1;
            System.out.println("Число позитивне, і + 1 дорівнює: " + digit);
        } else if (digit < 0) {
            digit = digit - 2;
            System.out.println("Число негативне, і - 2 дорівнює: " + digit);
        }
    }
}