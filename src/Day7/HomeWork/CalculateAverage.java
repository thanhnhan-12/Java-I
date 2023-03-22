package Day7.HomeWork;

public class CalculateAverage {
  /* 1. Variables */
  private String name;
  private int age;
  private String address;
  private float marksOfSubjects;

  /* 2. Constuctor */
  public CalculateAverage() {
  }

  public CalculateAverage(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  /* 3. Getter and Setter */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public float getMarksOfSubjects() {
    return marksOfSubjects;
  }

  public void setMarksOfSubjects(float marksOfSubjects) {
    this.marksOfSubjects = marksOfSubjects;
  }

  public float average(float mathGrade, float physicalGrade, float chemistryGrade) {
    marksOfSubjects = (mathGrade + physicalGrade + chemistryGrade) / 3;
    return marksOfSubjects;
  }

  public void displayInformation() {
    System.out.println("My name is " + name);
    System.out.println("My age is " + age);
    System.out.println("My address is " + address);
  }

  public static void main(String[] args) {
    CalculateAverage cal = new CalculateAverage("Pep", 52, "Spain");

    cal.displayInformation();
    System.out.println("Marks of Subjects: " + cal.average(8, 9, 8));

  }

}
