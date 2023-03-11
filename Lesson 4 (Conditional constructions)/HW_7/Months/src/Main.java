import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Щоб дізнатись кількість днів місяца введіть цифру номер місяця: 1-12");
        byte number = in.nextByte();
//                          Case
//      1  Січень: 31 день   (1)
//      2  Лютий: 28 днів    (3)
//      3  Березень: 31 день (1)
//      4  Квітень: 30 днів  (2)
//      5  Травень: 31 день  (1)
//      6  Червень: 30 днів  (2)
//      7  Липень: 31 день   (1)
//      8  Серпень: 31 день  (1)
//      9  Вересень: 30 днів (2)
//     10  Жовтень: 31 день  (1)
//     11  Листопад: 30 днів (2)
//     12  Грудень: 31 день  (1)
//        1, 3, 5, 7, 8, 10, 12     Case (1) 31 день
//        4, 6, 9, 11               Case (2) 30 днів
//        2                         Case (3) 28 днів
        switch (number) {
            case 2: {
                System.out.println("28 днів");
                break;
            }
            case 1, 3, 5, 7, 8, 10, 12: {
                System.out.println("31 день");
                break;
            }
            case 4, 6, 9, 11: {
                System.out.println("30 днів");
                break;
            }
        }
    }
}