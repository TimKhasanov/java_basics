import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            String text = input;
            String regex = "(\\W+\\s){2}\\W+";
            if (text.matches(regex)) {
                String[] word = text.split(" ");
                System.out.println("Фамилия: " + word[0] + "\n" + "Имя: " + word[1] + "\n" + "Отчество: " + word[2]);
            } else {
                System.out.println("Введенная строка не является ФИО");
            }
        }
    }
}
