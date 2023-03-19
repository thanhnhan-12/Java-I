package Day6.Example.Example1;

public class Student {
  static int count = 0;
  private int id;
  private String name;
  private int age;
  private String address;

  public Student() {
  }

  public Student(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
    id = ++count;
  }

  // Method Greeting
  public String greeting() {
    String s = "Hello";
    return s;
  }

  // Method Introduce
  public void introduce() {
    System.out.println("-------------------");
    System.out.println("My name is: " + name);
    System.out.println("ID        : " + id);
    System.out.println("Age       : " + age);
    System.out.println("Address   : " + address);
  }

  public static void main(String[] args) {
    Student s1 = new Student("Pep Guardiola", 18, "Spain");
    Student s2 = new Student("Jurgen Klopp", 18, "Germany");

    System.out.println("Hello: " + s1.greeting());
    s1.introduce();

    System.out.println("\nHello: " + s2.greeting());
    s2.introduce();

  }
}
