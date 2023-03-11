import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("\nВведіть цифру початку ряду Фібоначі: ");
        int n = in.nextInt();

        int start = 1;
        int tmp = 0;

        if (n >= 0) {
            System.out.println("Число  : Число Фібоначі");
            System.out.println("   0   :    0");
            for (int j = 2; j <= (n + 1); ++j) {
                System.out.println("   " + (j - 1) + "   :    " + start);
                int next = tmp + start;
                tmp = start;
                start = next;
            }
        } else
            System.out.println("Ви ввели невірне число");

        System.out.print("\nВведіть цифру кінця ряду Фібоначі: ");
        int m = in.nextInt();
        if (m > n) {
            System.out.println("Число  : Число Фібоначі");
            for (int i = (n + 1); m >= i; ++i) {
                System.out.println("   " + (i) + "   :    " + start);
                int next = tmp + start;
                tmp = start;
                start = next;
            }
        } else
            System.out.println("Число має бути більше ніж перше");
    }

}