public class AttendanceBuilder {
    
    private String studentName;
    private int rollNumber;
    private String attendancePercentage;
    private String date;
    private String teacher;
    private String course;


    public AttendanceBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public AttendanceBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public AttendanceBuilder setAttendancePercentage(String  attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
        return this;
    }

    public AttendanceBuilder setdate(String  date) {
        this.date = date;
        return this;
    }

    public AttendanceBuilder setteacher(String  teacher) {
        this.teacher = teacher ;
        return this;
    }

    public AttendanceBuilder setcourse(String course) {
        this.course = course ;
        return this;
    }







    public Attendance build() {
        return new Attendance(studentName, rollNumber, attendancePercentage,date,teacher,course);
    }
}
