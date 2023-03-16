package Day5.HomeWork;

import java.util.Scanner;

public class Bai4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap chuoi bat ky: ");
    String s = sc.nextLine();

    int count = 0;

    System.out.println("String: " + s);
    for (int i = 0; i < s.length(); i++) {
      System.out.println("String: " + i++);
      count++;
    }

    sc.close();
  }
}
