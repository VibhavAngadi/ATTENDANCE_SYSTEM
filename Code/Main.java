import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create model, view, and controller objects
        Scanner scanner = new Scanner(System.in);
        
        Attendance attendanceModel = new Attendance("John", 101, "present","a","a","a");
        AttendanceView attendanceView = new AttendanceView();
        AttendanceController attendanceController = new AttendanceController(attendanceModel, attendanceView);

        // Create AttendanceLogger (Singleton)
        AttendanceLogger attendanceLogger = AttendanceLogger.getInstance();

        // Create AttendanceObserver (Observer)
        AttendanceObserver attendanceObserver = new AttendanceObserver();
        attendanceModel.addObserver();

        // Create AttendanceBuilder (Builder)
        AttendanceBuilder attendanceBuilder = new AttendanceBuilder();

        // Populate initial attendance list
        List<Attendance> attendanceList = new ArrayList<>();
        attendanceList.add(attendanceModel);

       
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("1. Display Attendance");
            System.out.println("2. Update Attendance Percentage");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Display Attendance
                    System.out.println("Attendance:");
                    //for (Attendance attendance : attendanceList) {
                        attendanceController.displayAttendance();
                   // }
                    break;
                case 2:
                    // Update Attendance Percentage
                    System.out.print("Enter student name: ");
                    String studentName = scanner.next();
                    System.out.print("Enter id : ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter new attendance : ");
                    String attendancePercentage = scanner.next();
                    System.out.print("Enter new date : ");
                    String date = scanner.next();
                    System.out.print("Enter teacher : ");
                    String teacher = scanner.next();
                    System.out.print("Enter course : ");
                    String course = scanner.next();
                   

                    Attendance newAttendance = attendanceBuilder.setStudentName(studentName)
                            .setRollNumber(rollNumber)
                            .setAttendancePercentage(attendancePercentage)
                            .setdate(date)
                            .setteacher(teacher)
                            .setcourse(course)
                            .build();

                    attendanceList.add(newAttendance);
                    attendanceModel.setAttendancePercentage(attendancePercentage);
                    attendanceController.updateAttendancePercentage(attendancePercentage);
                    attendanceLogger.logAttendance(studentName,rollNumber,attendancePercentage,date,teacher,course);
                    break;
                case 3:
                    // Exit
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
