package Day3.HomeWork;

import java.util.Scanner;

public class Bai8 {
  public static void main(String[] args) {
    // Nhap ky tu bat ky chuyen ve ma ASCII

    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap ky tu bat ky: ");
    char character = sc.next().charAt(0);

    System.out.println("Ky tu " + character + " co ma ASCII " + " la: " + (byte)character );

    sc.close();

  }
}
