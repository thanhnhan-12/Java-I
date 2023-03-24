package Day8.Test.Test1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManager {
  private List<Student> students;

  public StudentManager() {
    this.students = new ArrayList<>();
  }

  public void addStudent(Student student) {
    
    this.students.add(student);
    
  }

  public List<Student> searchStudentByName(String name) {
    return this.students.stream().filter(o -> o.getStudentName().contains(name)).collect(Collectors.toList());
  }

  public void showListInforStudent() {
    this.students.forEach(o -> System.out.println(o.toString()));
  }

}
