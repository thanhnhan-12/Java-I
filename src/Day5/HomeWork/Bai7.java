package Day5.HomeWork;

import java.util.Scanner;

public class Bai7 {
  public static void main(String[] args) {
    // Check if the first and the last element of an array of integers are same
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so luong phan tu cua mang: ");
    int number = sc.nextInt();

    int[] arr = new int[number];

    // Input array
    for (int i = 0; i < arr.length; i++) {
      System.out.print("arr" + "[" + i + "]" + " = ");
      arr[i] = sc.nextInt();
    }

    // Output array
    System.out.println("Mang sau khi nhap: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr" + "[" + i + "]" + " = " + arr[i]);
    }

    System.out.println("Do dai cua mang la: " + arr.length);

    if (arr[0] == arr[arr.length - 1]) {
      System.out.println("Phan tu dau " + arr[0] + " va " + "phan tu cuoi " + arr[arr.length - 1] + " giong nhau ");
    } else {
      System.out.println("Phan tu dau " + arr[0] + " va " + "phan tu cuoi " + arr[arr.length - 1] + " khong giong nhau ");
    }

    sc.close();
  }
}
