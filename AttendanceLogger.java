import java.sql.*;
public class AttendanceLogger {

    private static AttendanceLogger instance;

    // Private constructor to prevent instantiation
    private AttendanceLogger() {
    }

    public static AttendanceLogger getInstance() {
        if (instance == null) {
            instance = new AttendanceLogger();
        }
        return instance;
    }

    public void logAttendance(String studentName, int rollNumber,  String attendancePercentage,String date,String teacher,String course) {
        // Logging logic
        try {
            // change url 
            String url = "jdbc:mysql://localhost:3307/attendance"; // Replace "mydatabase" with the name of your database
            String username = "root"; // Replace "root" with your MySQL username
            String password = ""; // Replace "password" with your MySQL password
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create a connection to the database
            Connection conn = DriverManager.getConnection(url, username, password);

            // Step 3: Create a statement
            Statement stmt = conn.createStatement();

            // Step 4: Execute the statement
            // change table name 
            String sql = "INSERT INTO attendance  (id,name,date,teacher,course,attendance) VALUES ('"+rollNumber+"' , '"+studentName+"' , '"+date+"' , '"+teacher+"' , '"+course+"', '"+attendancePercentage+"')";
            //String sql = "Select * from attendance";
            int rowsAffected = stmt.executeUpdate(sql);
           // ResultSet rs = stmt.executeQuery(sql);
            // Step 5: Process the results
            System.out.println(rowsAffected + " row(s) affected.");
            
           /*  while (rs.next()) {
                int id = rs.getInt("id");
                String  name = rs.getString("name");
                String  date = rs.getString("date");
                String  teacher = rs.getString("teacher");
                String  course = rs.getString("course");
                String  attendance = rs.getString("attendance");
                System.out.println(id + ", " + name + ", " + date +
                                   ", " + teacher + ", " + course + ", " +attendance);
               
              }*/
            // Step 6: Close the statement and connection
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



        System.out.println("Logged attendance for " + studentName + ", Roll Number: " + rollNumber +
                ", Attendance Percentage: " + attendancePercentage + "%");
    }
}
