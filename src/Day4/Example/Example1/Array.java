package Day4.Example.Example1;

public class Array {
  public static void main(String[] args) {
    int[][] a = {
        { 7, 2, 9, 0 },
        { 9, 0, 5, 1 },
        { 8, 0, 3, 6 },
    };

    System.out.print("Do dai cua mang la: " + a.length + "\n");

    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a.length + 1; j++) {
        System.out.print("\narr" + "[" + i + "]" + "[" + j  + "]" + " = " + a[i][j]);
      }
      System.out.println(" ");
    }

    

  }
}
