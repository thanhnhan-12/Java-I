package Day2.HomeWork;

import java.util.Scanner;

public class Bai3 {
  public static void main(String[] args) {
    /*
     * Nhap 1 so kiem tra co phai la so 0
     */

    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so: ");
    int Number = sc.nextInt();

    if(Number == 0) {
      System.out.println("This is " + Number);
    }
    else {
      System.out.println("Not 0");
    }

  }
}
