import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        float operand1 = 5, operand2 = 2;
        String operation;
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть знак операції над числами:  +, -, *, /");
        operation = in.next();

        switch (operation) {

            case "+":
                System.out.println("x + y = " + (operand1 + operand2));
                break;

            case "-":
                System.out.println("x - y = " + (operand1 - operand2));
                break;

            case "*":
                System.out.println("x * y = " + (operand1 * operand2));
                break;

            case "/":
                System.out.println("x / y = " + (operand1 / operand2));
                break;

            default:
                System.out.println("Ви ввели невірний символ");
                break;
        }
    }
}