import java.util.Observable;
import java.util.Observer;

public class AttendanceObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Attendance attendance = new Attendance(null, 0, null,null,null,null);
        System.out.println("Observer: Attendance for " + attendance.getStudentName() +
                ", Roll Number: " + attendance.getRollNumber() +
                ", Attendance Percentage: " + attendance.getAttendancePercentage() + "%");
    }
}
