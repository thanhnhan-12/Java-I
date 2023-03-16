package Day5.HomeWork;

import java.util.Scanner;

public class Bai2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so luong phan tu cua chuoi: ");
    int numbers = sc.nextInt();

    String[] arr = new String[numbers];

    for(int i = 0; i < arr.length; i++) {
      System.out.print("arr" + "[" + i + "]" + " = " );
      arr[i] = sc.next();
    }

    System.out.println("Mang sau khi nhap: ");
    for(int i = 0; i < arr.length; i++) {
      System.out.println("arr" + "[" + i + "]" + " = " + arr[i]);
    }


    sc.close();
  }
}
