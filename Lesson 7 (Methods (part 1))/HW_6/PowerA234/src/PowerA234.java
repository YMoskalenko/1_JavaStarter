import java.util.Scanner;

public class PowerA234 {
    public static int sec(int a) {
        int b = a * a;
        return b;
    }

    public static int thr(int a) {
        int c = a * a * a;
        return c;
    }

    public static int four(int a) {
        int d = a * a * a * a;
        return d;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введіть число яке хочете піднести до степені");
        int a = in.nextInt();

        System.out.println(a + " в 2й = " + sec(a));
        System.out.println(a + " в 3й = " + thr(a));
        System.out.println(a + " в 4й = " + four(a));
    }
}