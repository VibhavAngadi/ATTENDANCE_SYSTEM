public class Attendance {
    private String studentName;
    private int rollNumber;
    private String attendancePercentage;
    private String date;
    private String teacher;
    private String course;

    public Attendance(String studentName, int rollNumber, String attendancePercentage,String date,String teacher,String courese) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.attendancePercentage = attendancePercentage;
        this.date = date;
        this.teacher =teacher;
        this.course =course;


    }

    public void addObserver()
    {
       int i = 1;
    }

    // Getters and setters
    public String getdate() 
    { 
        return date;
     }
 
    // Method 2 - Setter
    public void setdate(String N)
    {
 
        // This keyword refers to current instance itself
        this.date = N;
    
    }

    public String getteacher() 
    { 
        return teacher;
     }
 
    // Method 2 - Setter
    public void setteacher(String N)
    {
 
        // This keyword refers to current instance itself
        this.teacher = N;
        
    }

    public String getcourse() 
    { 
        return course;
     }
 
    // Method 2 - Setter
    public void setcourse(String N)
    {
 
        // This keyword refers to current instance itself
        this.course = N;
        
    }















 
    // Method 1 - Getter
    public String getAttendancePercentage() 
    { 
        return attendancePercentage;
     }
 
    // Method 2 - Setter
    public void setAttendancePercentage(String N)
    {
 
        // This keyword refers to current instance itself
        this.attendancePercentage = N;
        
    }
    public String getStudentName() 
    { 
        return studentName ;
     }
 
    // Method 2 - Setter
    public void setStudentName (String N)
    {
 
        // This keyword refers to current instance itself
        this.studentName = N;
    }

    public int getRollNumber() 
    { 
        return rollNumber ;
     }
 
    // Method 2 - Setter
    public void setRollNumber (int N)
    {
 
        // This keyword refers to current instance itself
        this.rollNumber = N;
    }
}
    // ...

