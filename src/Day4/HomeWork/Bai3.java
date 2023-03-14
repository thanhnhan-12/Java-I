package Day4.HomeWork;

import java.util.Scanner;

public class Bai3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so luong phan tu cua mang: ");
    int numbers = sc.nextInt();

    int[] arr = new int[numbers];

    int sum = 0;

    for(int i = 0; i < arr.length; i++) {
      System.out.print("arr" + "[" + i + "]" + " = ");
      arr[i] = sc.nextInt();
    }

    System.out.println("\nMang sau khi nhap: ");
    for(int i = 0; i < arr.length; i++) {
      System.out.println("arr" +  "[" + i + "]" + " = " + arr[i]);
    }

    for (int e : arr) {
      int gt = 1;
      for(int i = 1; i <= e; i++) {
        gt *= i;
      }
      sum += gt;
    }
    System.out.println("Tong giai thua la: " + sum);

    sc.close();

  }
}
