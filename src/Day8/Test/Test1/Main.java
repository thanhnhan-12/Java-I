package Day8.Test.Test1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    StudentManager studentManager = new StudentManager();

    while (true) {
      System.out.println("\n---------- Application Manager Students ----------");
      System.out.println("Enter 1: To insert Students");
      System.out.println("Enter 2: To search Students by name: ");
      System.out.println("Enter 3: To show information Students");
      System.out.println("Enter 4: To exit:");

      System.out.print("Choose your number: ");
      int number = sc.nextInt();

      switch (number) {
        case 1: {
          System.out.print("_ Enter Student ID: ");
          int id = sc.nextInt();
          sc.nextLine();

          System.out.print("_ Enter Student Name: ");
          String studentName = sc.nextLine();

          System.out.print("_ Enter Sesmeter: ");
          int semester = sc.nextInt();

          sc.nextLine();
          System.out.print("_ Enter Course Name: ");
          String courseName = sc.nextLine();

          Student student = new Student(id, studentName, semester, courseName);
          studentManager.addStudent(student);
          System.out.println(" " + student.toString());

          sc.close();
          break;
        }

        case 2: {
          sc.nextLine();
          System.out.print("Enter name to search: ");
          String name = sc.nextLine();
          studentManager.searchStudentByName(name).forEach(student -> {
            System.out.println(student.toString());
          });

          break;
        }

        case 3: {
          studentManager.showListInforStudent();
          break;
        }

        case 4: {
          return;
        }

        default:
          System.out.println("Invalid");
          continue;

      }

    }

  }
}
