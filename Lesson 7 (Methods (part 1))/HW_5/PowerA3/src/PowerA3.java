import java.util.Scanner;

public class PowerA3 {
    public static int pow(int a) {
        int b = a * a * a;
        return b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введіть число яке хочете піднести до кубу");
        int a = in.nextInt();

        System.out.println(pow(a));


        System.out.println("Часткова таблиця кубів:");
        System.out.println("2 в кубі = " + pow(2));
        System.out.println("3 в кубі = " + pow(3));
        System.out.println("5 в кубі = " + pow(5));
        System.out.println("6 в кубі = " + pow(6));
        System.out.println("9 в кубі = " + pow(9));
    }
}