public class AttendanceController {
    private Attendance model;
    private AttendanceView view;
    private  String studentName ;

    public AttendanceController(Attendance model, AttendanceView view) {
        this.model = model;
        this.view = view;
    }
    

    public void updateAttendancePercentage(String  attendancePercentage) {
        model.setAttendancePercentage(attendancePercentage);
        view.displayMessage("Attendance percentage updated successfully.");
    }
    


    public void displayAttendance() {
        String studentName = model.getStudentName();
        int rollNumber = model.getRollNumber();
        String  attendancePercentage = model.getAttendancePercentage();
        view.displayAttendance(studentName, rollNumber, attendancePercentage);
    }
}
