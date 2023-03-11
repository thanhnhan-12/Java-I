package Day3.HomeWork;

public class Bai6 {
  public static void main(String[] args) {
    // In ra so khong phai SNT tu 1 -> 100
    System.out.println("Cac so khong phai so nguyen to tu 1 -> 100: ");
    for(int i = 2; i <= 100; i++) {
      if(i == 1) {
        System.out.println(i);
        continue;
      }
      boolean isPrime = true;
      for(int j = 2; j <= Math.sqrt(i); j++) {
        if(i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        continue;
      }
      System.out.println(i);

    }

  }
}
