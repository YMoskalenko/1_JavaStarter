import java.util.Scanner;

public class RebotedMetods {
    static int average(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    static int average(int a, int b, int c, int d) {
        int average = (a + b + c + d) / 4;
        return average;
    }

    static int average(int a, int b, int c, int d, int e) {
        int average = (a + b + c + d + e) / 5;
        return average;
    }

    static void myMetod(int average3, int average4, int average5) {
        int average = (average3 + average4 + average5) / 3;
        System.out.println("Середнє з трьох методів = " + average);
        int max = (average3 > average4) ? average3 : average4;
        int maximal = (max > average5) ? max : average5;
        System.out.println("Найбільше з трьох методів = " + maximal);
        int min = (average3 < average4) ? average3 : average4;
        int minimal = (min < average5) ? min : average5;
        System.out.println("Найменше з трьох методів = " + minimal);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введіть п'ять чисел використовуючи Enter");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        System.out.println("Середнє для a: " + a + ", b: " + b + ", c: " + c + " дорівнює " + average(a, b, c));
        System.out.println("Середнє для a: " + a + ", b: " + b + ", c: " + c + ", d: " + d + " дорівнює " + average(a, b, c, d));
        System.out.println("Середнє для a: " + a + ", b: " + b + ", c: " + c + ", d: " + d + ", e: " + e + " дорівнює " + average(a, b, c, d, e));

        myMetod(average(a, b, c), average(a, b, c, d), average(a, b, c, d, e));
    }
}