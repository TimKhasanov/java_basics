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
                char symbol = name.charAt(i);
                if (symbol == ' ') {
                    space++;
                    continue;
                }
                if (Character.UnicodeBlock.of(symbol) != Character.UnicodeBlock.CYRILLIC && symbol != '-') {
                    space = 0;
                    break;
                }
            }
            if (space != 2) {
                System.out.println("Введенная строка не является ФИО");
            } else {
                System.out.println(
                        "Фамилия: " + name.substring(0, name.indexOf(' ')) + System.lineSeparator() +
                                "Имя:" + name.substring(name.indexOf(' '), name.lastIndexOf(' ')) + System.lineSeparator() +
                                "Отчество:" + name.substring(name.lastIndexOf(' ')));
            }

        }

    }
}

