package Day9.Test;


import java.util.*;

public class StudentRepository {

	// attributes

	private static List<Student> students = new ArrayList<Student>();
	private static int idCounter = 0;

	// methods...
	// Add student
	public static void Add(Student student) {
		student.id = GetId();
		students.add(student);
	}

	// Update student
	public static void Update(String id, Student student) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				students.get(i).setStudentName(student.getStudentName());
				students.get(i).setSemester(student.getSemester());
				students.get(i).setCourseName(student.getCourseName());
				break;
			}
		}
	}

	// Delete student
	public static void Delete(String id) {
		students.removeIf(e -> e.getId().equals(id));
	}

	// List students
	public static List<Student> List() {
		Collections.sort(students, new StudentComparator());
		return students;
	}

	// Check record id existing on list
	public static boolean IsStudentExisting(String id) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	// Count all students
	public static int CountStudent() {
		return students.size();
	}

	private static synchronized String GetId() {
		idCounter = idCounter + 1;
		return String.valueOf(idCounter);
	}

	public static class StudentComparator implements Comparator<Student> {
		@Override
		public int compare(Student s, Student t) {
			int f = s.studentName.compareTo(t.studentName);
			return (f != 0) ? f : s.courseName.compareTo(t.courseName);
		}
	}
}
