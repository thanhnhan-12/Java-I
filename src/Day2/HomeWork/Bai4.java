package Day2.HomeWork;

import java.util.Scanner;

public class Bai4 {
  public static void main(String[] args) {
    /*
     * Giai phuong trinh bac 1: ax + b = 0
     */

    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap a = ");
    int a = sc.nextInt();

    System.out.print("Nhap b = ");
    int b = sc.nextInt();

    if (a == 0 && b != 0) {
      System.out.println("Phuong trinh vo nghiem");
    } else if (a != 0 && b != 0) {

      System.out.println("Phuong trinh co mot nghiem duy nhat x = " + (-b * 1.0 / a));

    } else if (a == 0 && b == 0) {
      System.out.println("Phuong trinh co vo so nghiem");
    }

  }
}
