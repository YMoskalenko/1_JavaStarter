import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть суму Вашої заробітньої плати: ");
        int salary = in.nextInt();
        System.out.println("Для розрахунку суми премії вкажіть кількість років Вашого стажу");
        byte year = in.nextByte();

        if (0 >= year)
            System.out.println("Ви ввели невірну кількість років, число має бути ціле і більше нуля");
        else if (0 < year && year < 5)
            System.out.println("Ваша премія становить 10%, а саме: " + salary * 0.1 + ". Повна зарплата: " + salary * 1.1);
        else if (5 <= year && year < 10)
            System.out.println("Ваша премія становить 15%, а саме: " + salary * 0.15 + ". Повна зарплата: " + salary * 1.15);
        else if (10 <= year && year < 15)
            System.out.println("Ваша премія становить 25%, а саме: " + salary * 0.25 + ". Повна зарплата: " + salary * 1.25);
        else if (15 <= year && year < 20)
            System.out.println("Ваша премія становить 35%, а саме: " + salary * 0.35 + ". Повна зарплата: " + salary * 1.35);
        else if (20 <= year && year < 25)
            System.out.println("Ваша премія становить 45%, а саме: " + salary * 0.45 + ". Повна зарплата: " + salary * 1.45);
        else if (year >= 25)
            System.out.println("Ваша премія становить 50%, а саме: " + salary * 0.5 + ". Повна зарплата: " + salary * 1.5);
    }
}