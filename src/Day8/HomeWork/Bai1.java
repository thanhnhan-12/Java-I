package Day8.HomeWork;

import java.util.Scanner;

public class Bai1 {
  /* 1. Variables */
  private float realNumber1;
  private float realNumber2;

  /* 2. Constructor */
  public Bai1() {
  }

  public Bai1(float realNumber1, float realNumber2) {
    this.realNumber1 = realNumber1;
    this.realNumber2 = realNumber2;
  }

  /* 3. Getter and Setter */
  public float getRealNumber1() {
    return realNumber1;
  }

  public void setRealNumber1(float realNumber1) {
    this.realNumber1 = realNumber1;
  }

  public float getRealNumber2() {
    return realNumber2;
  }

  public void setRealNumber2(float realNumber2) {
    this.realNumber2 = realNumber2;
  }

  /* 4. Methods */
  public float divide() {
    return realNumber1 / realNumber2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so thu nhat: ");
    float realNumber1 = sc.nextFloat();

    System.out.print("Nhap so thu hai: ");
    float realNumber2 = sc.nextFloat();

    Bai1 obj = new Bai1(realNumber1, realNumber2);

    try {
      System.out.println("Divide: " + obj.divide());
  
    } catch (Exception e) {
      System.out.println("Error handled");
    }

    System.out.println("The program continues");
    
    sc.close();

  }

}
