package Day7.HomeWork;

public class Point2D {
  // 1. Variables
  private double x;
  private double y;

  // 2. Constructor
  public Point2D() {}

  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }


  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  // 3. Methods
  // 3.1 Move()
  public void move(float dx, float dy) {
    x += dx;
    y += dy;
  }

  // 3.2 Distance()
  public float distance(Point2D point) {
    return (float) Math.sqrt( Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2) );
  }

  // 3.3 Display()
  public void display() {
    System.out.println("Move to a new position: " + " (" + x + " , " + y + ")");

  }

  public static void main(String[] args) {
    Point2D p1 = new Point2D(8.8, 9.2);
    Point2D p2 = new Point2D();

    p1.display();
    p2.display();
    p2.move(2, 3);
    System.out.println(" " + p2.distance(p2));
  }
}
