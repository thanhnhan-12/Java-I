package Day3.Example.Example1;

public class Foreach {
  public static void main(String[] args) {
    String[] cars = {"BMW", "F1", "Mclaren", "Lexus"};

    // for
    for(int i = 0; i < cars.length; i++ ) {
      System.out.println("Cars " + i + " : " + cars[i]);
    }

    System.out.println("------------");

    // foreach
    for (String s : cars) {
      System.out.println("Cars: " + s);
    }

  }
}
