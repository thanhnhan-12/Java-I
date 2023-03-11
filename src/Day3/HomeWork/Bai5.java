package Day3.HomeWork;

public class Bai5 {
  public static void main(String[] args) {
    // In ra SNT tu 1 -> 100
    System.out.println("Cac so nguyen to tu 1 -> 100: ");
    for(int i = 2; i <= 100; i++) {
      boolean isPrime = true;
      for(int j = 2; j <= Math.sqrt(i); j++) {
        if(i % j == 0) {
          isPrime = false;
          break;
        }
      }

      if(isPrime) {
        System.out.println(i);
      }

    }
  }
}
