package Day5.HomeWork;

import java.util.Scanner;

public class Bai1 {
  public static void main(String[] args) {
    // Find the smallest number among three numbers

    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so luong phan tu cua mang: ");
    int numbers = sc.nextInt();

    int[] arr = new int[numbers];

    for(int i = 0; i < arr.length; i++) {
      System.out.print("arr" + "[" + i + "]" + " = " );
      arr[i] = sc.nextInt();
    }

    System.out.println("Mang sau khi nhap: ");
    for(int i = 0; i < arr.length; i++) {
      System.out.println("arr" + "[" + i + "]" + " = " + arr[i]);
    }
    
    int min = arr[0];

    for(int i = 0; i < arr.length; i++) {
      if(min > arr[i]) {
        min = arr[i];
      }
    }

    System.out.println("Smallest number among three numbers: " + min);

    sc.close();
  }
}
