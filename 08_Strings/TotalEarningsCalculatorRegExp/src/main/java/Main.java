import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  static int sum = 0;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    System.out.println(calculateSalarySum(text));
  }

  public static int calculateSalarySum(String text){
    Pattern pattern = Pattern.compile("([0-9]+) руб");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      int start = matcher.start();
      int end = matcher.end();
      String result = text.substring(start, end);
      result = result.replaceAll("([^0-9]+)", "").trim();
      int i = Integer.parseInt(result);
      sum += i;


    }
    return sum;

  }


  }

