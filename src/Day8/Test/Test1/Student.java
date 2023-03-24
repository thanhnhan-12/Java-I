package Day8.Test.Test1;

public class Student {
  /* 1. Variables */
  private int id;
  private String studentName;
  private int semester;
  private String courseName;

  /* 2. Constructor */
  public Student() {
  }

  public Student(int id, String studentName, int semester, String courseName) {
    this.id = id;
    this.studentName = studentName;
    this.semester = semester;
    this.courseName = courseName;
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

  /* 4. Methods */
  @Override
  public String toString() {
    return "=> Students List { " +
        "Student ID = " + id +
        ", Student name = '" + studentName + '\'' +
        ", Semester = " + semester +
        ", Course name = '" + courseName + '\'' +

        '}';
  }

}
