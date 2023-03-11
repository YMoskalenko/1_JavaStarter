import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Виберіть і введіть слово для перекладу:");
        System.out.print("1. сонячно     ");   //sunny
        System.out.println("2. хмарно");       //сloudy
        System.out.print("3. злива       ");   //shower
        System.out.println("4. туман");        //foggy
        System.out.print("5. вітер       ");   //windy
        System.out.println("6. град");         //frozen rain

        String word = in.next();

        switch (word) {
            case "сонячно": {
                System.out.println("sunny");
                break;
            }
            case "хмарно": {
                System.out.println("сloudy");
                break;
            }
            case "злива": {
                System.out.println("shower");
                break;
            }
            case "туман": {
                System.out.println("foggy");
                break;
            }
            case "вітер": {
                System.out.println("windy");
                break;
            }
            case "град": {
                System.out.println("frozen rain");
                break;
            }
            default: {
                System.out.println("Невірно введене слово, введіть згідно прикладу зазначеному вище");
                break;
            }

        }
    }
}