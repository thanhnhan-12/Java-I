package Day8.HomeWork;

import java.util.Scanner;

public class Bai1 {

  /* Methods */
  public float divide(float realNumber1, float realNumber2) {
    return realNumber1 / realNumber2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Bai1 obj =  new Bai1();

    
    try {
      System.out.print("Nhap so thu nhat: ");
      float realNumber1 = sc.nextFloat();
  
      System.out.print("Nhap so thu hai: ");
      float realNumber2 = sc.nextFloat();

      float result = obj.divide(realNumber1, realNumber2);
      System.out.println("Divide: " + result);
  
    } catch (ArithmeticException e) {
      System.out.println("Error handled");

    }
    

    System.out.println("The program continues");
    
    sc.close();

  }

}
