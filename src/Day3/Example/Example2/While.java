package Day3.Example.Example2;

public class While {
  public static void main(String[] args) {
    int sum = 0;
    int i = 1;
    while (i <= 99) {
      sum += i;
      i += 2; 
    }

    System.out.println("Tong so le tu 1 -> 99: " + sum);
  }
}
