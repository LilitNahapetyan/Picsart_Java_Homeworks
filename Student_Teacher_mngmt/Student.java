import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

  private int studentId;
  private List<Course> enrolledCourses;
  private List<GradeReport> gradeReports;

  public Student(String name, String address, String email, int studentId) {
    super(name, address, email);
    this.studentId = studentId;
    this.enrolledCourses = new ArrayList<>();
    this.gradeReports = new ArrayList<>();
  }

  public int getStudentId() {
    return studentId;
  }

  public List<Course> getEnrolledCourses() {
    return enrolledCourses;
  }

  public List<GradeReport> getGradeReports() {
    return gradeReports;
  }

  public void enrollCourse(Course course) {
    enrolledCourses.add(course);
    course.addStudent(this);
  }

  public void dropCourse(Course course) {
    enrolledCourses.remove(course);
    course.dropStudent(this);
  }

  public double calculateGPA() {
    double totalGradePoints = 0;
    int numGradeReports = gradeReports.size();

    for (GradeReport gradeReport : gradeReports) {
      double grade = gradeReport.getGrade();
      totalGradePoints += grade;
    }

    if (numGradeReports == 0) {
      return 0;
    }

    return totalGradePoints / numGradeReports;
  }
}
