public class Main {
    public static void main(String[] args) {
//      uberflu?;           - неможливо
        byte _Identifier = 1;
//      \u006fIdentifier;   - неможливо, початок, це формат запису символа Char
//      &myVar;             - неможливо
        byte myVariab1le = 2;

        System.out.println(_Identifier);
        System.out.println(myVariab1le);
    }
}