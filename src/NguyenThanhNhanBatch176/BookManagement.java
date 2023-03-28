package NguyenThanhNhanBatch176;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookManagement {
  private ArrayList<Book> bookList;
  private int count;

  public BookManagement() {
    bookList = new ArrayList<Book>();
    count = 0;
  }

  // Method check genre
  public boolean isValidGenre(String genre) {
    return genre.equalsIgnoreCase("Network") ||
        genre.equalsIgnoreCase("AI") ||
        genre.equalsIgnoreCase("Programming");
  }

  // Method check ISBN
  public boolean isValidISBN(String isbn) {
    // Check if ISBN matches one of the following formats:
    // xxxxx-xx-xx-x
    // xxxx-x-xxxx-x
    // xxx-xxx-xxx-x
    // xx-xxxxxx-x-x
    return isbn.matches("\\d{5}-\\d{2}-\\d{2}-\\d")
        || isbn.matches("\\d{4}-\\w-\\w{4}-\\d")
        || isbn.matches("\\d{3}-\\d{3}-\\d{3}-\\d")
        || isbn.matches("\\w{2}-\\d{6}-\\w-\\d");
  }

  // Method Add a Book
  public void addBook() {
    Scanner scanner = new Scanner(System.in);

    if (bookList.size() >= 3) {
      System.out.print("Number of books exceeded 3. Do you want to continue (Y/N)? ");
      String choice = scanner.nextLine();
      if (!choice.equalsIgnoreCase("Y")) {
        return;
      }
    }

    int id = bookList.size() + 1;
    System.out.println("_ ID: " + id);

    System.out.print("_ Enter book name: ");
    String title = scanner.nextLine();

    System.out.print("_ Enter author name: ");
    String author = scanner.nextLine();

    System.out.print("_ Enter book genre (Network, AI, Programming): ");
    String genre = scanner.nextLine();
    while (!isValidGenre(genre)) {
      System.out.print("genre Is Invalid, Please Enter Again: ");
      genre = scanner.nextLine();
    }

    String isbn;
    do {
      System.out.print("_ Enter ISBN: ");
      isbn = scanner.nextLine();
    } while (!isValidISBN(isbn));

    System.out.print("_ Enter price: ");
    double price = scanner.nextDouble();

    count++;
    bookList.add(new Book(id, title, author, genre, price, isbn));
    System.out.println("=> Add Book Succesfully! ");

  }

  // Methods Search Book
  public void searchBooks() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("_ Enter Name of Book: ");
    String keyword = scanner.nextLine();

    System.out.println("ID \tName \tAuthor \tGenre \tISBN \tPrice");
    for (Book book : bookList) {
      if (book.getTitle().contains(keyword)) {
        System.out.println(book);
      }
    }

    // scanner.close();

  }

  // Methods Update / Delete
  public void updateOrDeleteBook() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("_ Enter book ID: ");
    int id = scanner.nextInt();

    boolean bookFound = false;
    for (Book book : bookList) {
      if (book.getId() == id) {
        bookFound = true;

        System.out.print("Do you want to update (U) or delete (D) the book? ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("U")) {
          System.out.print("_ Enter new price: ");
          double newPrice = scanner.nextDouble();
          book.setPrice(newPrice);
          System.out.println("=> Book updated successfully.");
        } else if (choice.equalsIgnoreCase("D")) {
          bookList.remove(book);
          System.out.println("=> Book deleted successfully.");
        } else {
          System.out.println("=> Invalid choice.");
        }

        break;
      }
    }

    // scanner.close();

    if (!bookFound) {
      System.out.println("=> Book not found.");
    }
  }

  // Methods Report
  public void report() {
    // Sort the book list by price
    Collections.sort(bookList, new Comparator<Book>() {
      @Override
      public int compare(Book b1, Book b2) {
        if (b1.getPrice() < b2.getPrice()) {
          return -1;
        } else if (b1.getPrice() > b2.getPrice()) {
          return 1;
        } else {
          return 0;
        }
      }
    });

    // Display the sorted book list
    System.out.println("ID\tName\tAuthor\tGenre\tISBN\tPrice");
    for (Book book : bookList) {
      System.out.println(book);
    }
  }

}
