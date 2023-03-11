import java.util.Arrays;
import java.util.Scanner;

public class ReversedArray {

    private static int[] myReverse(int[] array, int size) {
        int[] newArray = new int[size];
        for (int i = 0; i <= size / 2; i++) {
            int temp = array[i];
            newArray[i] = array[size - 1 - i];
            newArray[size - 1 - i] = temp;
        }
        System.out.println("Масив після реверсу: ");
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    private static int[] subArray(int[] array, int index, int count, int size) {
        int sizeNew = count - index;
        int[] newSubArray = new int[sizeNew];
        if (index <= size) {
            System.out.println("Масив з елемента " + index);

            for (int i = index; i < size; i++) {
                newSubArray[size - 1 - i] = array[i];
            }
            if (count > size) {
                for (int i = (size - index); i < sizeNew; i++) {
                    newSubArray[i] = 1;
                }
            }
        } else System.out.println("Індекс більше ніж довжина масиву");
        System.out.println(Arrays.toString(newSubArray));
        return newSubArray;
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

        myReverse(array, size);

        System.out.println("Введіть index: ");
        int index = in.nextInt();
        System.out.println("Введіть count: ");
        int count = in.nextInt();

        subArray(array, index, count, size);


    }
}