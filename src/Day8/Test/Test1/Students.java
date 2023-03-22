package Day8.Test.Test1;

import java.util.Scanner;

public class Students {
  /* 1. Variables */
  static int count = 0;
  private int id;
  private String studentName;
  private int semester;
  private String courseName;

  /* 2. Constructor */
  public Students() {}

  public Students(String studentName, int semester, String courseName) {
    this.studentName = studentName;
    this.semester = semester;
    this.courseName = courseName;
    id = ++count;
  }

  /* 3. Getter and Setter */
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }
  
  /* 4 Methods */
  // 4.1. Create
  public void createStudents() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nhap vao so luong hoc sinh: ");
    int numberOfStudents = sc.nextInt();

    while (true) {
      if(numberOfStudents > 3) {
        System.out.println("Nhap hoc sinh thu: " + id);
        studentName = sc.nextLine();
        System.out.println("Nhap ky hoc: ");
        semester = sc.nextInt();
        System.out.println("Nhap khoa hoc: ");
        courseName = sc.nextLine();
      }
    }
  }

  // 4.2 Find/ Sort

  
  // 4.3 Update/ Delete

  // 4.4 Report

}
