public class Main {
    public static void main(String[] args) {
//      byte a = 99999; (byte: -128 ... 127), треба int: -32768 ... 32767
        int a = 99999;
        System.out.println(a);
//        або
        byte b = (byte) 99999;
        System.out.println(b);
    }
}