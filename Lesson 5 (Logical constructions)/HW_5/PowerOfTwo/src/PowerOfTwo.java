public class PowerOfTwo {
    public static void main(String[] args) {

        int a = 64, i = 0;

        int x = a;
        do {
            x = x / 2;
            i++;
        } while (x != 1);

        if (Math.pow(2, i) == a)
            System.out.println("Число " + a + " є степеню числа 2, в степені: " + i);
        else
            System.out.println("Число не є числа 2 в степені");
    }
}