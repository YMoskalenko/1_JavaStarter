import java.util.Scanner;

public class Calculator {

    public static float calculate(float a, float b, float c) {
        float average = ((a + b + c) / 3);
        return average;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введіть 3 числa: a,b,c (через Enter):");
        float a = in.nextInt();
        float b = in.nextInt();
        float c = in.nextInt();

        System.out.println("Середнє арифметичне = " + calculate(a, b, c));


    }
}