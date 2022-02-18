import java.util.Scanner;
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
            System.out.println(formatPhone(text));

        }
    }

    public static String formatPhone(String text) {
        String countryCode = "7";
        String regex = "[^0-9]";
        text = text.replaceAll(regex, "");
        if (text.length() > 11 || text.length() < 10) {
            return "Неверный формат номера";
        } else if (text.length() == 10) {
            countryCode += text;
            return countryCode;
        } else if (text.charAt(0) == '8' || text.charAt(0) == '7') {
            if (text.charAt(0) == '8') {
                return text.replace(text.charAt(0), '7');
            }
            return text;
        } else {
            return "Неверный формат номера";
        }
    }
}