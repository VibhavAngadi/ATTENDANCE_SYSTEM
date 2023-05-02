import java.sql.*;
import java.lang.*;
public class AttendanceView {
    


    public void displayAttendance(String studentName, int rollNumber, String  attendancePercentage) {

        displaysql();
        
    }

    public void  displaysql()
    {
        String url = "jdbc:mysql://localhost:3307/attendance"; // Replace "mydatabase" with the name of your database
        String username = "root"; // Replace "root" with your MySQL username
        String password = ""; // Replace "password" with your MySQL password
        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create a connection to the database
            Connection conn = DriverManager.getConnection(url, username, password);

            // Step 3: Create a statement
            Statement stmt = conn.createStatement();

            // Step 4: Execute the statement
            //String sql = "INSERT INTO attendance  (id,name,date,teacher,course,attendance) VALUES (1,'vibhav','2015-12-17','teacher','ooad','present')";
           String sql = "Select * from attendance";
            //int rowsAffected = stmt.executeUpdate(sql);
            ResultSet rs = stmt.executeQuery(sql);
            // Step 5: Process the results
            //System.out.println(rowsAffected + " row(s) affected.");
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String  name = rs.getString("name");
                String  date = rs.getString("date");
                String  teacher = rs.getString("teacher");
                String  course = rs.getString("course");
                String  attendance = rs.getString("attendance");
                System.out.println(id + ", " + name + ", " + date +
                                   ", " + teacher + ", " + course + ", " +attendance);
               
              }
            // Step 6: Close the statement and connection
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
