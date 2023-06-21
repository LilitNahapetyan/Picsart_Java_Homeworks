//Department: Represents a group of related majors or courses. 
//Attributes include the department name, department head, and a list of courses that the department offers. Department can have report for all courses.
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private String departmentHead;
    private List<Course> courses;

    public Department(String departmentName, String departmentHead) {
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
        this.courses = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void generateCourseReport() {
    System.out.println("Department: " + departmentName);
    System.out.println("Courses:\n");

    for (Course course : courses) {
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Teacher: " + course.getAssignedTeacher().getName());
        System.out.println("-----------------------------");
    }
}

}