import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            String name = input;
            int space = 0;
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == ' ') {
                    i++;
                }

            }
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) >= '0' && name.charAt(i) <= '9' || space > 2 || space == 0) {
                    System.out.println("Введенная строка не является ФИО");
                    break;
                } else {
                    System.out.println(
                            "Фамилия: " + name.substring(0, name.indexOf(' ')) + System.lineSeparator() +
                                    "Имя:" + name.substring(name.indexOf(' '), name.lastIndexOf(' ')) + System.lineSeparator() +
                                    "Отчество:" + name.substring(name.lastIndexOf(' ')));
                    break;

                }

            }


            //TODO:напишите ваш код тут, результат вывести в консоль.
            //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
        }
    }

}