package NguyenThanhNhanBatch176;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BookManagement bookManagement = new BookManagement();

    while (true) {
      System.out.println("---------- WELCOME TO BOOK MANAGER ----------");
      System.out.println("1. Add book");
      System.out.println("2. Search books");
      System.out.println("3. Update/ Delete book");
      System.out.println("4. Report");
      System.out.println("5. Exit");

      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          bookManagement.addBook();
          break;
        case 2:
          bookManagement.searchBooks();
          break;
        case 3:
          bookManagement.updateOrDeleteBook();
          break;
        case 4:
          bookManagement.report();
          break;
        case 5:
          System.exit(0);
        default:
          System.out.println("Invalid choice.");
          break;
      }

      // scanner.close();
    }

  }

}
