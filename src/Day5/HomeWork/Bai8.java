package Day5.HomeWork;

import java.util.Scanner;

public class Bai8 {
  public static void main(String[] args) {
    /*
     * Swap the first and last elements of an array (lenght must be at least 1) and
     * create a new array
     */

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

    // Swap array
    int temp = arr[0];
    arr[0] = arr[arr.length - 1];
    arr[arr.length - 1] = temp;

    System.out.println("Mang sau khi hoan doi: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    sc.close();

  }
}
