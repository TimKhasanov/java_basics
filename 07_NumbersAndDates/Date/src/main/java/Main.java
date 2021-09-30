import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE" ).
                localizedBy(new Locale("us"));

        long pastBirthdays = birthday.until(today, ChronoUnit.YEARS);
        String a = "";

        if (today.compareTo(birthday) >= 0) {
            for (long i = 0; i <= pastBirthdays; i++) {
                a += i + " - " + formatter.format(birthday.plusYears(i)) + "\n";
            }
        }





        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
        return a;
    }

}
