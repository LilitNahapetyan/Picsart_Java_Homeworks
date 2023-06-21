import java.util.Date;

public class GradeReport {
    private Course course;
    private Student student;
    private double grade;
    private Date date;
    private Attendance attendance;

    public GradeReport(Course course, Student student, double grade, Date date) {
        this.course = course;
        this.student = student;
        this.grade = grade;
        this.date = date;
        this.attendance = null;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }
}