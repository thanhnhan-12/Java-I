package Day9.HomeWork.BookManager;

public class Book {
  /* 1. Variables */
  private int id;
  private String title;
  private String author;
  private String category;
  private String isbn;
  private double price;

  /* 2. Constructor */
  public Book() {

  }

  public Book(int id, String title, String author, String category, String isbn, double price) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.category = category;
    this.isbn = isbn;
    this.price = price;
  }

  /* 3. Getter and Setter */
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "ID: " + id + "\nTitle: " + title + "\nAuthor: " + author + "\nCategory: " + category
        + "\nISBN: " + isbn + "\nPrice: " + price + "\n";
  }

}