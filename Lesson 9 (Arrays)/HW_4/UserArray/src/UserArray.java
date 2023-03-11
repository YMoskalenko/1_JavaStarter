import java.util.Arrays;
import java.util.Scanner;

public class UserArray {


    private static int[] myMetod(int[] array, int size) {
        int sizeNew = size + 1;
        int[] newArray = new int[sizeNew];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        System.out.println("Масив після збыльшення на 1: ");
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    private static int[] myNewMetod(int[] array, int size, int value) {
        int sizeNew = size + 1;
        int[] newArrayValue = new int[sizeNew];
        newArrayValue[0] = value;
        for (int i = 0; i < size; i++) {
            newArrayValue[i + 1] = array[i];
        }
        System.out.println("Масив після збыльшення на 1: ");
        System.out.println(Arrays.toString(newArrayValue));
        return newArrayValue;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть кількість елементів масиву n: ");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i * 2 + 1;
        }

        System.out.println("Елементи масиву n:");
        System.out.println("[Індекс]   :  [Значення]");
        for (int i = 0; i < size; i++) {
            System.out.println("  [" + i + "]      :       " + array[i]);
        }
        myMetod(array, size);
        System.out.println("Введіть значення індексу 0: ");
        int value = in.nextInt();
        myNewMetod(array, size, value);
    }
}