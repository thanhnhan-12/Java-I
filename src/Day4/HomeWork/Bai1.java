package Day4.HomeWork;

import java.util.Arrays;
import java.util.Scanner;


public class Bai1 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Nhap so luong phan tu cua mang: ");
    int numbers = sc.nextInt();
    int[] arr = new int[numbers]; 

    for(int i = 0; i < arr.length; i++) {
      System.out.print("arr" + "[" + i + "]" + " = ");
      arr[i] = sc.nextInt();
    }

    System.out.println("\nMang sau khi nhap: ");
    for(int i = 0; i < arr.length; i++) {
      System.out.println("arr" +  "[" + i + "]" + " = " + arr[i]);
    }

    // Cach 1:
    Arrays.sort(arr);
    System.out.print("\nMang sau khi sap xep: " + Arrays.toString(arr));

    // Cach 2:
    for(int i = 0; i < arr.length; i++) {
      for(int j = i; j < i + 1; j++) {
        if(arr[i] > arr[j]) {
          int temp;
          arr[i] = arr[j];
          temp   = arr[i];
          arr[j] = temp;
        }
      }
    }

    System.out.println("\nMang sau khi sap xep: " + Arrays.toString(arr));

    sc.close();

  }
}
