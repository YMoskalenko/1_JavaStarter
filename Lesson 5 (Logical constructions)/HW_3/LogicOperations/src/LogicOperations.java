public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;

        {
            int rez = x += y >> x++ * z;
            System.out.println("1) x += y >> x++ * z = " + rez);
        }

        {
            System.out.println("2) ++x & y * 5 = " + (z = ++x & y * 5));
        }
        {
            int rez = y /= x + 5 | z;
            System.out.println("3) y /= x + 5 | z = " + rez);
        }

        {
            System.out.println("4) x++ & y * 5 = " + (z = x++ & y * 5));
        }

        {
            System.out.println("5) y << x++ ^ z = " + (x = y << x++ ^ z));
        }
    }
}