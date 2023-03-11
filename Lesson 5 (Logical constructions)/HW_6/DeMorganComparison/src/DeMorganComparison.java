public class DeMorganComparison {

    public static void main(String[] args) {
        boolean a = false, b = true;

        System.out.println("Вираз A | B еквівалентний виразу: !(!A & !B) ");
        System.out.println("Значення: А = " + a + ", B = " + b);

        if (!(!a & !b))
            System.out.println("!(!A & !B) = " + (!(!a & !b)));
        else
            System.out.println("!(!A & !B) = " + (!(!a & !b)));


    }
}