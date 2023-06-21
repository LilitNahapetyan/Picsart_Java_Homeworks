import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Attendance {
    private Date date;
    private Course course;
    private List<Student> studentsPresent;

    public Attendance(Date date, Course course) {
        this.date = date;
        this.course = course;
        this.studentsPresent = new ArrayList<>();
    }

    public Date getDate() {
        return date;
    }

    public Course getCourse() {
        return course;
    }

    public List<Student> getStudentsPresent() {
        return studentsPresent;
    }

    public void markAttendance(Student student) {
        studentsPresent.add(student);
    }

    public void removeAttendance(Student student) {
        studentsPresent.remove(student);
    }
}