public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    int a = amountOfEarnings(text, "Вася");
    int b = amountOfEarnings(text, "Петя");
    int c = amountOfEarnings(text, "Маша");
    int summ = a + b + c;
    System.out.println(summ);


  }

  public static int amountOfEarnings(String input, String name) {
    int earn = 0;
    int i;

    for (int a = 0; a < input.length(); a++) {
      i = input.indexOf(name);
      if (i == -1) break;
      input = input.substring(i + name.length()).trim();
      i = input.indexOf(" руб");
      if (i == -1) break;
      input = input.substring(0, i).trim();
      i = input.lastIndexOf(" ");
      if (i == -1) break;
      earn = Integer.parseInt(input.substring(i, input.length()).trim());

    }
    return earn;
  }
}