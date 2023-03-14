package Day3.HomeWork;

import java.util.*;

public class Bai7 {
  public static void main(String[] args) {
    // In ra tam giac can
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Nhap so bat ky: ");
    int number = sc.nextInt();

    for(int i = 1; i <= number; i++) {
      // In ra khoang trang
      for(int j = 1; j <= number - i ; j++) {
        System.out.print(" " );
      }
      // In ra dau *
      for(int k = 1; k <= (i * 2) - 1; k++) {
        System.out.print("*");
      }

      System.out.println();
    }

    sc.close();

  }
}
