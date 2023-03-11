import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        int min = 0, max = 0, sum = 0;
        float average = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть кількість елементів масиву n: ");
        int n = in.nextInt();
        int[] array = new int[n];
        array[0] = 4;

//      Заповнюємо масив
        for (int i = 1; i < n; i++) {
            array[i] = i * 2 + 1;
        }

//      Виводимо масив
        System.out.println("Елементи масиву n:");
        System.out.println("[Індекс]   :  [Значення]");
        for (int i = 0; i < n; i++) {
            System.out.println("  [" + i + "]      :       " + array[i]);

        }
//      Мінімальне значення масиву
        min = array[0];
        for (int i = 1; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Мінімальний елемент масиву дорівнює: " + min);

//      Максимальне значення масиву
        max = array[0];
        for (int i = 1; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальний елемент масиву дорівнює: " + max);

//      Сума елементів масиву
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("Сума елементів масиву дорівнює: " + sum);

//      Середнє арифметичне
        average = (float) sum / n;
        System.out.println("Середнє арифметичне всіх елементів дорівнює: " + average);

//      Вивід непарних елементів
        System.out.println("Елементи масиву які мають непарні значення:");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("array[" + i + "] = " + array[i]);
            }
        }
    }
}