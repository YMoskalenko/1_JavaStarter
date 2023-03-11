import java.util.Scanner;

public class NumbersCheck {

    static int var = 2;

    private static void negative(int n) {

        if (n == 0) System.out.println("Ви ввели 0, він не негативний і не позитивний");
        else if (n < 0) {
            System.out.println("Введене число негативне");
        } else System.out.println("Введене число позитивне");
    }

    private static void checkIsItANaturalNumber(int n) {
        if (n < 1)
            n = -n;
        if (n > 1) {
            if (n % var != 0) {
                var++;
                checkIsItANaturalNumber(n);
            } else if (n % var == 0) {
                printIsItNaturalNumber(var, n);
            }
        }
    }

    private static void printIsItNaturalNumber(int var, int n) {

        if (var == n) {
            System.out.println("Число " + n + " є натуральним");
        } else {
            System.out.println("Число " + n + " не є натуральним");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введіть любе число");
        int n = in.nextInt();

        negative(n);

        checkIsItANaturalNumber(n);


    }
}