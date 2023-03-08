package Day2.HomeWork;

import java.util.Scanner;

public class Cau5 {
  public static void main(String[] args) {
    /*
     * 
     */

     Scanner sc = new Scanner(System.in);

     System.out.print("Nhap diem: ");
     double grade = sc.nextDouble();

     if(grade > 9 && grade <= 10) {
      System.out.println("Xuat xac");
     }

     if(8 <= grade && grade <= 9) {
      System.out.println("Gioi");
     }

     if(7 <= grade && grade < 8) {
      System.out.println("Kha");
     }

     if(5 <= grade && grade < 7) {
      System.out.println("Trung binh");
     }

     if(grade < 5) {
      System.out.println("Kem");
     }
  }
}
