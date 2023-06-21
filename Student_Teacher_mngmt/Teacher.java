import java.util.Date;

public class Teacher extends Person {
    private String subject;
    private double salary;

    Teacher(String name, String address, String email, String subject, double salary) {
        super(name, address, email);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    public void assignGrade(Student student, Course course, double grade, Date date) {
        GradeReport gradeReport = new GradeReport(course, student, grade,date);
        student.getGradeReports().add(gradeReport);
    }
}
