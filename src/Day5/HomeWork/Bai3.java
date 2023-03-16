package Day5.HomeWork;

import java.util.Scanner;

public class Bai3 {
  public static void main(String[] args) {
    // Count all words in a string 

    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap chuoi bat ky: ");
    String inputString = sc.nextLine();

    // tách chuỗi thành một mảng các từ bằng cách sử dụng khoảng trắng làm dấu phân cách
    String[] words = inputString.split(" ");

    int count = words.length;

    System.out.println("So cac tu trong chuoi la:" + count);

    sc.close();
  }
}
