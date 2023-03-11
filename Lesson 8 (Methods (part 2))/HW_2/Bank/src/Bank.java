import java.util.Scanner;

public class Bank {

    public static void pay(int creditOverral, int payMin) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введіть суму поточного платежу");
        int creditPay = in.nextInt();
        if (creditPay >= payMin) {
            creditOverral -= creditPay;
            if (creditOverral == 0)
                payEnd();
            else if (creditOverral > 0)
                payNoEnd(creditOverral);
            else
                payBigest(creditOverral);
        } else System.out.println("Внесений платіж менше необхідного");
    }

    public static void payEnd() {
        System.out.println("Кредит закритий (заборгованості немає)");
    }

    public static void payNoEnd(int creditOverral) {
        System.out.println("Сума для закриття кредиту становить: " + creditOverral + " грн.");
        System.out.println("Якщо клієнт хоче ще внести платіж натисніть: + , або 0 , якщо ні");
        int payMin = 100;
        Scanner in = new Scanner(System.in);
        String plus = in.next();
        if (plus.equals("+"))
            pay(creditOverral, payMin);
        else {
            System.out.println("Приходьте ще, приносьте гроші");
        }
    }

    public static void payBigest(int creditOverral) {
        System.out.println("Сума надлишково сплачених коштів становить: " + (-creditOverral) + " грн.");
    }


    public static void main(String[] args) {

        int creditOverral = 700;
        int payMin = 100;

        pay(creditOverral, payMin);
    }
}