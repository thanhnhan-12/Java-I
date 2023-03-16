package Day5.HomeWork;

public class Bai5 {
  public static void main(String[] args) {
    /*
     * Stores the factorials of all the number between 1 (included) and 10
     * (included) in an array and pirnts them in a reverse order
     */

    int[] factorials = new int[10];

    for (int i = 1; i <= 10; i++) {
      int factorial = 1;
      for (int j = 1; j <= i; j++) {
        factorial *= j;
      }
      factorials[i - 1] = factorial;
    }

    for (int i = factorials.length - 1; i >= 0; i--) {
      System.out.println(factorials[i]);
    }

  }
}
