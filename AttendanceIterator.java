import java.util.*;
public class AttendanceIterator implements Iterator<Attendance> {
    private List<Attendance> attendanceList;
    private int currentIndex;

    public AttendanceIterator(List<Attendance> attendanceList) {
        this.attendanceList = attendanceList;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < attendanceList.size();
    }

    @Override
    public Attendance next() {
        Attendance attendance = attendanceList.get(currentIndex);
        currentIndex++;
        return attendance;
    }

    @Override
    public void remove() {
        // Not implemented
    }
}
