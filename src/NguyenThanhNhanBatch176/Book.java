package NguyenThanhNhanBatch176;

public class Book {
  /* 1. Variables */
  private int id;
  private String title;
  private String author;
  private String genre;
  private double price;
  private String isbn;
  
  /* 2. Constructor */
  public Book() {

  }

  public Book(int id, String title, String author, String genre, double price, String isbn) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.price = price;
    this.isbn = isbn;
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

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
  
  @Override
  public String toString() {
    return "_ ID: " + id + "\n_ Title: " + title + "\n_ Author: " + author + "\n_ Genre: " + genre
        + "\n_ ISBN: " + isbn + "\n_ Price: " + price + "\n";
  }

}
