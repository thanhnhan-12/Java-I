package Day5.HomeWork;

import java.util.Scanner;

public class Bai4 {
  public static void main(String[] args) {
    // Compute the sum of the digits in an integer

    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so bat ky: ");
    int number = sc.nextInt();
    
   int sum = 0;

   while(number != 0) {
    int digit = number % 10;
    sum += digit;
    number /= 10;
   }

    System.out.println("Tong cac chu so trong 1 so nguyen la: " + sum);

    sc.close();
  }
}
