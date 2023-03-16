package Day5.HomeWork;

import java.util.Scanner;

public class Bai9 {
  public static void main(String[] args) {
    // multiply corresponding elements of two arrays of integers 

    Scanner sc = new Scanner(System.in);

    System.out.print("_ Nhap so luong phan tu cua mang: ");
    int number = sc.nextInt();

    int[] arr1 = new int[number];
    int[] arr2 = new int[number];
    int[] result = new int[number];

    // Input array 1
    for(int i = 0; i < arr1.length; i++) {
      System.out.print("arr1" + "[" + i + "]" + " = ");
      arr1[i] = sc.nextInt();
    }

    // Output array 1
    System.out.println("=> Mang 1 sau khi nhap: ");
    for(int i = 0; i < arr1.length; i++) {
      System.out.println("arr1" + "[" + i + "]" + " = " + arr1[i] );
    }

    System.out.println();
    // Input array 2 
    for(int i = 0; i < arr2.length; i++) {
      System.out.print("arr2" + "[" + i + "]" + " = ");
      arr2[i] = sc.nextInt();
    }

    // Output array 2
    System.out.println("=> Mang 2 sau khi nhap: ");
    for(int i = 0; i < arr2.length; i++) {
      System.out.println("arr2" + "[" + i + "]" + " = " + arr2[i]);
    }

    // Multiply two arrays
    for(int i = 0; i < arr1.length; i++ ) {
      result[i] = arr1[i] * arr2[i];
    }

    System.out.println("Mang sau khi nhan: ");
    for(int i = 0; i < result.length; i++) {
      System.out.println(result[i] + " ");
    }

    sc.close();

  }
}
