import java.util.Scanner;

public class SumPlusDig {
    public static void main(String[] args) {

        int a = 0, b = 0, sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть два числа: а і b, де а має бути менше за b");
        System.out.println(" ");
        System.out.print("Введіть число a: ");
        a = in.nextInt();
        System.out.print("Введіть число b: ");
        b = in.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0)
                    sum = sum + i;
            }
            System.out.print("Сума усіх парних чисел між " + (a) + " та " + (b) + " дорівнює: " + sum);
        } else
            System.out.print("Ви ввели невірні дані");
    }
}