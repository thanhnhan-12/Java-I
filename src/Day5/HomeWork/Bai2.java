package Day5.HomeWork;

import java.util.Scanner;

public class Bai2 {
  public static void main(String[] args) {
    // Count all vowels in a string

    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap chuoi bat ky: ");
    String inputString = sc.nextLine();

    int vowelCount = 0;

    for(int i = 0; i < inputString.length(); i++) {
      // Kiem tra cac ky tu la so nguyen am
      char check = Character.toLowerCase(inputString.charAt(i));
      if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
        vowelCount++;
      }
    }

    System.out.print("Cac so nguyen am trong chuoi la: " + vowelCount);

    sc.close();
  }
}
