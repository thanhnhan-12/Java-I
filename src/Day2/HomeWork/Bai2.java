package Day2.HomeWork;

import java.util.Scanner;

public class Bai2 {
  public static void main(String[] args) {
    /*
     * Nhap 2 so nguyen tim max
     */
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so thu nhat: ");
    int Number1 = sc.nextInt();

    System.out.print("Nhap so thu hai: ");
    int Number2 = sc.nextInt();

    if(Number1 >= Number2) {
      System.out.print("Max: " + Number1);
    }
    else {
      System.out.print("Max: " + Number2);
    }

    System.out.println("\nMax: " + ((Number1 >= Number2 ) ? Number1 : Number2));
  }
}
