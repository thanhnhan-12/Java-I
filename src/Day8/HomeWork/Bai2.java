package Day8.HomeWork;

import java.util.Scanner;

public class Bai2 {
  /* Methods */
  public static void inputArray(int[] arr) {
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < arr.length; i++) {
      System.out.print("arr" + "[" + i + "]" + " = ");
      arr[i] = sc.nextInt();
    }

    sc.close();
  }

  public static void outputArray(int[] arr) {
    System.out.println("Mang sau khi nhap: ");
    for(int i = 0; i < arr.length; i++) {
      System.out.println("arr" + "[" + i + "]" + " = " + arr[i]);
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so luong phan tu cho mang: ");
    int number = sc.nextInt();

    int[] arr = new int[number];

    try {
      for(int i = 0; i < arr.length; i++) {
        inputArray(arr);
        outputArray(arr);        
      }
    } catch (Exception e) {
      System.out.println("Error handled ");
    }

    System.out.println("The program continues");
    
    sc.close();

  }

 
}
