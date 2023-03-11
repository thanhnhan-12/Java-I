package Day3.HomeWork;

public class Bai3 {
  public static void main(String[] args) {
    System.out.println("Tong cac so chia het cho 3 tu 3 -> 99: ");
    int Sum = 0;

    /* 1. For */
    for(int i = 3; i <= 99; i++) {
      if(i % 3 == 0) {
        Sum += i;
      }
    }
    System.out.println("-> " + Sum);
    
    int i = 3;

    /* 2. While */
    // while (i <= 99) {
    //   if(i % 3 == 0)
    //   Sum += i;
    // }
    // i++;
    //   System.out.println(Sum);

    /* 3. Do While */
    // do {
    //   if(i % 3 == 0) {
    //     Sum += i;
    //   }
    //   i++;
    //   System.out.println(Sum);
    // } while (i <= 99 ); 

  }
}
