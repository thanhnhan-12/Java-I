package Day9.Example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.*;

public class Functional {
  public static void main(String[] args) {
    // Convert String to int
    Function<String, Integer> numberConverter = (str) -> Integer.parseInt(str);
    System.out.println(numberConverter.apply("1"));

    // Convert Date to String
    Function<LocalDate, String> dateConvert = (d) -> d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    System.out.println(dateConvert.apply(LocalDate.now()));

    //
    Function<Integer, Integer> time2 = n -> n * 2;
    Function<Integer, Integer> squared = n -> n * n;

    Function<Integer, Integer> andThen = time2.andThen(squared);
    System.out.println("Example for and then: " + andThen.apply(5));

    Function<Integer, Integer> compose = time2.compose(squared);
    System.out.println("Example for and then: " + compose.apply(5));


  }

}
