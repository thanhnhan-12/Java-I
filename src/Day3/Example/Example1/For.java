package Day3.Example.Example1;

public class For {
  public static void main(String[] args) {
    // Tinh tong cac so le tu 1 den 100
    // 1. Khai bao bien gi ?
    int sum = 0;
    for(int i = 1; i <= 99; i++) {
      if(i % 2 != 0)
        sum += 1;
    }
    System.out.print("Tong cac so le tu 1 den 99 la: " + sum);
  }
}
