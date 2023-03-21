package Day7.Example;

// Rectangle

public class Bai1 {
  // 1. variables
  private double width, height;

  /* 2. Methods */
  // 2.1 Constructor
  public Bai1() {}

  public Bai1(double width, double height) {
    this.width = width;
    this.height = height;
  }

  // 2.2 Getter and Setter
  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  /* 3. Methods */
  // 3.1 Perimeter
  public void selfPerimeter() {
    System.out.println("Perimeter: " + ((width + height) * 2) );
  }

  // 3.2 Area
  public double selfArea() {
    return width * height;
  }

  public static void main(String[] args) {
    Bai1 recPer = new Bai1(4, 5);
    Bai1 recArea = new Bai1(2, 3);

    recPer.selfPerimeter();

    System.out.println("Area: " + recArea.selfArea());

  }
}
