//Course: Represents a subject being taught in the school or university. 
//It includes attributes like course name, course code, the teacher assigned to the course, and a list of students enrolled.
import java.util.ArrayList;
import java.util.List;


public class Course {
    private String courseName;
    private String courseCode;
    private List<Student> enrolledStudents;
    private Teacher assignedTeacher;


    public Course(String courseName, String courseCode, Teacher assignedTeacher) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.assignedTeacher = assignedTeacher;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Teacher getAssignedTeacher() {
        return assignedTeacher;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setCourseName(String newCourseName) {
        this.courseName = newCourseName;
    }

    public void setCourseCode(String newCourseCode) {
        this.courseCode = newCourseCode;
    }

    public void setAssignedTeacher(Teacher newTeacher) {
        this.assignedTeacher = newTeacher;
    }

    public void addStudent(Student newStudent) {
        enrolledStudents.add(newStudent);
    }

    public void dropStudent(Student student) {
        enrolledStudents.remove(student);
    }

}