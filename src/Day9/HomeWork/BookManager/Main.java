package Day9.HomeWork.BookManager;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BookManager bookManager = new BookManager();

    while (true) {
      System.out.println("---------- WELCOME TO BOOK MANAGER ----------");
      System.out.println("1. Add book");
      System.out.println("2. Search books");
      System.out.println("3. Update/Delete book");
      System.out.println("4. Exit");

      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          bookManager.addBook();
          break;
        case 2:
          bookManager.searchBooks();
          break;
        case 3:
          bookManager.updateOrDeleteBook();
          break;
        case 4:
          System.exit(0);
        default:
          System.out.println("Invalid choice.");
          break;
      }

      // scanner.close();
    }


  }
}
