import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть число із діапазону 0 - 100");

        byte digit = in.nextByte();

        if ((digit < 0) | (digit > 100))
            System.out.println("Введене число не входить в діапазон 0 - 100");
        else if (digit <= 14)
            System.out.println("Число в діапазон 0 - 14");
        else if (digit >= 15 & digit <= 35)
            System.out.println("Число в діапазон 15 - 35");
        else if (digit >= 36 & digit <= 50)
            System.out.println("Число в діапазон 36 - 50");
        else if (digit >= 51 & digit <= 100)
            System.out.println("Число в діапазон 51 - 100");

    }
}