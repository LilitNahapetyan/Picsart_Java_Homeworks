//Classroom: Represents a physical location where a course is taught. 
//Attributes include the room number, capacity (number of seats available), and available equipment. 
//Should be function to check is course can use this classroom for lesson.
import java.util.List;

public class Classroom{
    private int roomNumber;
    private int capacity;
    private List<String> availableEquipment;

    Classroom(int roomNumber, int capacity, List<String> availableEquipment){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.availableEquipment = availableEquipment;
    }

     public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getAvailableEquipment() {
        return availableEquipment;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAvailableEquipment(List<String> availableEquipment) {
        this.availableEquipment = availableEquipment;
    }

    public boolean canUseClassroom(Course course) {
        int enrolledStudentsCount = course.getEnrolledStudents().size();
        return enrolledStudentsCount <= capacity;
}

    
}