import java.util.Scanner;

public class Conversion {

    private static float conversation(int money, float changeCourse) {
        return money / changeCourse;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("money");
        int money = in.nextInt();

        System.out.println("changeCourse");
        float changeCourse = in.nextFloat();

        float moneyChange = conversation(money, changeCourse);
        System.out.println(moneyChange);
    }


}