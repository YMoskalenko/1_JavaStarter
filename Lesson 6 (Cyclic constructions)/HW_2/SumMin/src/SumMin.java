import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {

        int a = 0, b = 0, sum = 0, digit = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть два числа: а і b, де а має бути менше за b");
        System.out.println(" ");
        System.out.print("Введіть число a: ");
        a = in.nextInt();
        System.out.print("Введіть число b: ");
        b = in.nextInt();

        if (a < b) {
            a = ++a;
            b = --b;
            sum = (a + b) * (b - a + 1) / 2;
        } else
            System.out.print("Ви ввели невірні дані");

        System.out.println("Сума усіх чисел від " + (a - 1) + " до " + (b + 1) + " дорівнює: " + sum);

        System.out.print("Непарні числа між " + (a - 1) + " та " + (b + 1) + ": ");
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}