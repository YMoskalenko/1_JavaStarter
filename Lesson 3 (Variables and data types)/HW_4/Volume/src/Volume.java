import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        double S, V;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть радіус (R) циліндру: ");
        float R = scanner.nextByte();
        System.out.println("Введіть висоту (h) циліндру: ");
        float h = scanner.nextByte();
//      πR2⋅H.
        V = Math.PI * Math.pow(R, 2) * h;
        System.out.println("Об'єм циліндру V = " + (float) V);
//      2πR(R+h)
        S = 2 * Math.PI * R * (R + h);
        System.out.println("Площа циліндру S = " + (float) S);
    }
}