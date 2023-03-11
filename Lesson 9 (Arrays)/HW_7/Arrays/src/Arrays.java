public class Arrays {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 1; i < 10; i++) {
            array[i] = i * 2 + 1;
        }

        System.out.println("Елементи масиву");
        System.out.println("[Індекс]   :  [Значення]");

        int i = 9;
        do {
            System.out.println("  [" + i + "]      :       " + array[i]);
            i--;
        } while (i >= 0);
    }
}