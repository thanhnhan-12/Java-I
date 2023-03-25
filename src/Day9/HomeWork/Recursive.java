package Day9.HomeWork;

import java.util.Scanner;

public class Recursive {
  public static float recursive(int number) {
    if(number == 0) 
      return (float) 1 / 2;
    else
      return (float) (2 * number + 1) / (2 * number + 2) + recursive(number - 1) ;
  }

  public static float sum(int number) {
    float sum = 0;
    for(int i = 0; i <= number; i++) {
      sum += (float) (2 * i + 1) / (2 * i + 2) ;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int number = sc.nextInt();

    System.out.println("Sum 1 = " + recursive(number));

    System.out.println("Sum 2 = " + sum(number));

    sc.close();
  }

}
