package Day9.Test;


public class Student {
	//attributes
	
    public String id;
    public String studentName;
    public String semester;
    public String courseName; 
    
    //constructor
    public Student(){

    }
    
    public Student(String id, String studentName, String semester, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester; 
        this.courseName = courseName;
    }
    
  //getter and setters

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
    	this.studentName = studentName;
    }

    public String getSemester() {
        return this.semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }    
    
    public String getStudentNameAndCourseName() {
        return this.studentName  +" | " +this.courseName;
    }
    
    @Override
    public String toString(){
        return "Id=" + this.id + ", StudentName=" + this.studentName + ", Semester=" + this.semester+ ", CourseName=" + this.courseName ;
    }
}
