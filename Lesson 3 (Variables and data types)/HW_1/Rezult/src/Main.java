public class Main {
    public static void main(String[] args) {

        int rezult1, rezult2;
//      1)
        {
            int x = 10, y = 12, z = 3;
            rezult1 = x += y - x++ * z;
            System.out.println("x +=y -  x++ * z = " + rezult1);
        }
//      2)
        {
            int x = 10, y = 12, z;
            z = --x - y * 5;
            System.out.println("z = " + z);
        }
//      3)
        {
            int x = 10, y = 12, z = 3;
            rezult2 = y /= x + 5 % z;
            System.out.println("y/=x + 5%z = " + rezult2);
        }

//      4)
        {
            int x = 10, y = 12, z;
            z = x++ + y * 5;
            System.out.println("z = " + z);
        }
//      5)
        {
            int x = 10, y = 12, z = 3;
            x = y - x++ * z;
            ;
            System.out.println("x = " + x);
        }
    }
}