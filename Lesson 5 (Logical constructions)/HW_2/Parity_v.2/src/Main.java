import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введіть любе число, щоб впевнитись воно парне чи непарне");
        int i = in.nextInt();

        if (i == 0)
            System.out.println("Ви ввели 0, нуль це просто 0 ;)");
        else if (i % 2 == 0)
            System.out.println("Введене Вами число: " + i + ", парне.");
        else
            System.out.println("Введене Вами число: " + i + ", непарне.");
    }
}