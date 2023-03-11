import java.util.Scanner;

public class Arithmetics {

    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }

    private static float div(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введіть а");
        int a = in.nextInt();
        System.out.println("Введіть b");
        int b = in.nextInt();
        System.out.println("Введіть знак операції: +,-,*,/");
        String symbol = in.next();

        if (symbol.equals("+") | symbol.equals("-") | symbol.equals("*") | symbol.equals("/")) {
            switch (symbol) {
                case "+":
                    int plus = add(a, b);
                    System.out.println(a + " + " + b + " = " + plus);
                    break;
                case "-":
                    int minus = sub(a, b);
                    System.out.println(a + " - " + b + " = " + minus);
                    break;
                case "*":
                    int multiply = mul(a, b);
                    System.out.println(a + " * " + b + " = " + multiply);
                    break;
                case "/":
                    if (b == 0) System.out.println("Ділення на 0 неможливо");
                    else {
                        float division = div(a, b);
                        System.out.println(a + " / " + b + " = " + division);
                    }
            }
        } else System.out.println("Ви ввели невірний знак операції");

    }


}