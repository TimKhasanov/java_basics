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
            String[] words = text.split(" ");
            String regex = "[^А-яёЁ\\-]+";
            String b = "";
            for (int i = 0; i < words.length; i++) {
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(text);
                if (matcher.find()) {
                    b += words[i] + " ";
                }
                if (b != regex) {
                    System.out.println("Введенная строка не является ФИО");


                }
                else {
                    b = b.trim();
                    System.out.println(words[i]);
                }



            }

        }
    }
}