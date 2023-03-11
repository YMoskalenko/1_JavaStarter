public class Main {
    public static void main(String[] args) {

        int a = 2, b = 4, c = 6, min = 0, max = 0, average = 0;

        System.out.println("Вхідні дані:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
//      Maximum
        if ((a > b) & (a > c))
            max = a;
        else if ((b > a) & (b > c))
            max = b;
        else if ((c > a) & (c > b))
            max = c;
//      Minimum
        if ((a < b) & (a < c))
            min = a;
        else if ((b < a) & (b < c))
            min = b;
        else if ((c < a) & (c < b))
            min = c;
//      Average
        if ((a != max) & (a != min))
            average = a;
        else if ((b != max) & (b != min))
            average = b;
        else if ((c != max) & (c != min))
            average = c;

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Average = " + average);
    }
}