package main.java;

import java.time.LocalDate;
import java.time.Period;

public class Main {

  public static void main(String[] args) {
    LocalDate birthday = LocalDate.of(1970,1,1);
    System.out.println(getPeriodFromBirthday(birthday));

  }

  private static Period getPeriodFromBirthday(LocalDate birthday) {
    LocalDate now = LocalDate.now();
    return Period.between(birthday, now);

  }

}
