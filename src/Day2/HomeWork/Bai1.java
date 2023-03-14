package Day2.HomeWork;

import java.util.Scanner;

public class Bai1 {
  public static void main(String[] args) {
    /*
     * Nhap 1 chuoi thong tin:
     * 
     * Ten, Tuoi, Diem, Dia chi
     */

    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap ten: " );
    String name = sc.nextLine();

    System.out.print("Nhap tuoi: " );
    int age = sc.nextInt();

    System.out.print("Nhap diem: ");
    float grade = sc.nextFloat();

    System.out.print("Nhap dia chi: ");
    String address = sc.next();

    System.out.print("Thong tin ca nhan: " + "\n- Ten " + name + "\n- Tuoi: " + age + "\n- Diem: " + grade + "\n- Dia chi: " + address );

    sc.close();
  }
}
