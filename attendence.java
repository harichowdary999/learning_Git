import java.util.Scanner;

public class attendence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of classes: ");
        int totalClasses = scanner.nextInt();

        System.out.print("Enter number of classes attended: ");
        int attendedClasses = scanner.nextInt();

        if (totalClasses <= 0) {
            System.out.println("Total classes must be greater than zero.");
        } else if (attendedClasses < 0 || attendedClasses > totalClasses) {
            System.out.println("Attended classes must be between 0 and total classes.");
        } else {
            double attendancePercentage = (attendedClasses * 100.0) / totalClasses;
            System.out.printf("Attendance: %.2f%%%n", attendancePercentage);

            if (attendancePercentage >= 75) {
                System.out.println("Status: Eligible / Good attendance.");
            } else {
                System.out.println("Status: Not eligible / Poor attendance.");
            }
        }
        //change from main branch
        scanner.close();
    }
}
