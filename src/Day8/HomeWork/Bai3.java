package Day8.HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Moi ban nhap ID: ");
      String id = sc.nextLine();

      System.out.println("Moi ban nhao ho va ten: ");
      String name = sc.nextLine();

      System.out.println("Moi ban nhap tuoi: ");
      int age = sc.nextInt();

      if (id.length() != 6)
        throw new ArithmeticException("Loi id");

      if (name.split(" ").length < 2)
        throw new InputMismatchException("Loi ho va ten");

      if (age < 19)
        throw new ArithmeticException("Loi tuoi");

      System.out.println("----- Thong tin -----");
      System.out.println("ID: " + id);
      System.out.println("Ho va ten: " + name);
      System.out.println("Tuoi: " + age);
    } catch (Exception e) {
      System.out.println("Loi id hoac tuoi");
      
    } catch (InputMismatchException e) {
      System.out.println("Chuong trinh tiep tuc");
    }

    sc.close();

  }
}
