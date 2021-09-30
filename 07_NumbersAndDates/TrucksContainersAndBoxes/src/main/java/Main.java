
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        int box = Integer.parseInt(boxes);
        int container = 0;
        int truck = 0;
        if (box > 0) {
            container++;
            truck++;
            System.out.println("Грузовик: " + truck);
            System.out.println("\tКонтейнер: " + container);
            for (int i = 1; i <= box; i++) {
                System.out.println("\t\tЯщик: " + i);
                if (i == box) {
                    break;
                }

                if (i % (12 * 27) == 0) {
                    truck += 1;
                    System.out.println("Грузовик: " + truck);
                }
                if (i % 27 == 0) {
                    container += 1;
                    System.out.println("\tКонтейнер: " + container);
                }

            }

        }
        System.out.println("Необходимо:\nгрузовиков - " + truck + " шт." + "\nконтейнеров - " + container + " шт.");
    }
    // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
    // пример вывода при вводе 2
    // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
}
