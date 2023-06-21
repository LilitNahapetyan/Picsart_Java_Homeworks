import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Lilit Nahapetyan", "Armenia", "lilit@example.com", 1234);

        // Create teachers
        Teacher teacher1 = new Teacher("Arman Arshakyan", "Armenia", "arman@example.com", "Java", 5000.0);
        Teacher teacher2 = new Teacher("Vardan Grigoryan", "Armenia", "vardan@example.com", "C", 5000.0);

        // Create courses
        Course course1 = new Course("Java", "Java_wave5", teacher1);
        Course course2 = new Course("C", "C_wave5", teacher2);

        // Enroll the student in the courses
        student.enrollCourse(course1);
        student.enrollCourse(course2);

        // Assign a grade to the student for the courses
        double grade1 = 95.0;
        Date gradeDate1 = new Date();
        teacher1.assignGrade(student, course1, grade1, gradeDate1);

         double grade2 = 94.0;
        Date gradeDate2 = new Date();
        teacher1.assignGrade(student, course1, grade2, gradeDate2);

        // Calculate the student's GPA
        double gpa = student.calculateGPA();
        System.out.println("Student's GPA: " + gpa);

        // Print the student's grade reports
        System.out.println("Grade Reports:");
        for (GradeReport gradeReport : student.getGradeReports()) {
            System.out.println("Course: " + gradeReport.getCourse().getCourseName());
            System.out.println("Grade: " + gradeReport.getGrade());
            System.out.println("Date: " + gradeReport.getDate());
            System.out.println("-----------------------------");
        }
    }
}
