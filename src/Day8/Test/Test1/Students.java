package Day8.Test.Test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {
  private int id;
  private String studentName;
  private int semester;
  private String courseName;

  public Students(int id, String studentName, int semester, String courseName) {
    this.id = id;
    this.studentName = studentName;
    this.semester = semester;
    this.courseName = courseName;
  }

  public int getId() {
    return id;
  }

  public String getStudentName() {
    return studentName;
  }

  public int getSemester() {
    return semester;
  }

  public String getCourseName() {
    return courseName;
  }

  public static ArrayList<Students> createStudents() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Students> students = new ArrayList<>();
    while (students.size() < 3) {
      System.out.print("Enter student ID: ");
      int id = scanner.nextInt();
      scanner.nextLine(); // consume newline character
      System.out.print("Enter student name: ");
      String name = scanner.nextLine();
      System.out.print("Enter semester: ");
      int semester = scanner.nextInt();
      scanner.nextLine(); // consume newline character
      System.out.print("Enter course name: ");
      String course = scanner.nextLine();
      students.add(new Students(id, name, semester, course));

      if (students.size() >= 3) {
        System.out.print("Do you want to continue (Y/N)? ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("N")) {
          break;
        }
      }
    }
    scanner.close();
    return students;
  }

  public static void printStudents(ArrayList<Students> students) {
    System.out.println("------ Information ------");
    for (Students student : students) {
      System.out.println("ID: " + student.getId());
      System.out.println("Name: " + student.getStudentName());
      System.out.println("Semester: " + student.getSemester());
      System.out.println("Course: " + student.getCourseName());
      System.out.println("----------------------------------");
    }
  }

  public static void main(String[] args) {
    ArrayList<Students> students = createStudents();
    printStudents(students);
  }

}
