package Day9.HomeWork.BookManager;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
  private ArrayList<Book> bookList;
  private int count;

  public BookManager() {
    bookList = new ArrayList<Book>();
    count = 0;
  }

  public boolean isValidCategory(String category) {
    return category.equalsIgnoreCase("Network") ||
        category.equalsIgnoreCase("AI") ||
        category.equalsIgnoreCase("Programming");
  }

  public void addBook() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter ID Book: ");
    int id = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter Book Name: ");
    String name = scanner.nextLine();

    System.out.print("Enter The Author: ");
    String author = scanner.nextLine();

    System.out.print("Enter Category (Network, AI, Programming): ");
    String category = scanner.nextLine();
    while (!isValidCategory(category)) {
      System.out.print("Category Is Invalid, Please Enter Again: ");
      category = scanner.nextLine();
    }

    System.out.print("Enter ISBN: ");
    String isbn = scanner.nextLine();

    System.out.print("Enter price: ");
    double price = scanner.nextDouble();

    bookList.add(new Book(id, name, author, category, isbn, price));
    System.out.println("Add Book Succesfully! ");

    scanner.nextLine(); // consume newline
    // scanner.close();

  }

  public void searchBooks() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter keyword: ");
    String keyword = scanner.nextLine();

    System.out.println("ID\tName\tAuthor\tCategory\tISBN\tPrice");
    for (Book book : bookList) {
      if (book.getTitle().contains(keyword)) {
        System.out.println(book);
      }
    }

    // scanner.close();

  }

  public void updateOrDeleteBook() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter book ID: ");
    int id = scanner.nextInt();

    boolean bookFound = false;
    for (Book book : bookList) {
      if (book.getId() == id) {
        bookFound = true;

        System.out.print("Do you want to update (U) or delete (D) the book? ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("U")) {
          System.out.print("Enter new price: ");
          double newPrice = scanner.nextDouble();
          book.setPrice(newPrice);
          System.out.println("Book updated successfully.");
        } else if (choice.equalsIgnoreCase("D")) {
          bookList.remove(book);
          System.out.println("Book deleted successfully.");
        } else {
          System.out.println("Invalid choice.");
        }

        break;
      }
    }

    // scanner.close();

    if (!bookFound) {
      System.out.println("Book not found.");
    }
  }

}