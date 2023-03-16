package Day5.HomeWork;

import java.util.Scanner;

public class Bai6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap chuoi bat ky: ");
    String s = sc.nextLine();

    // a. Dem co bao nhieu ki tu a
    int count = 0;
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == 'a') {
        count++;
      }
    }
    System.out.print("So lan xuat hien cua ki tu a: " + count);

    // b. Kiem tra xem co tu Java
    System.out.print("\nNhap tu bat ky: ");
    String s2 = sc.nextLine();

    int check = s2.indexOf("Nhan");
    if(check == 0) {
      System.out.println("\nChu " + s2 + " co trong chuoi");
    }
    else {
      System.out.println("\nChu " + s2 + " khong co trong chuoi");
    }

    // c. Kiem tra bat dau bang Write
    System.out.print("\nNhap tu bat ky: ");
    String s3 = sc.nextLine();

    if(s3.startsWith("Write")) {
      System.out.println("Chuoi bat dau bang tu \"Write\"");
    }
    else {
      System.out.println("Chuoi khong bat dau bang tu \"Write\"");
    }

    sc.close();
  }
}
