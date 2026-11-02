package studentinformationsystem;

public class StudentInformationSystem {

    public static void main(String[] args) {
        // i. Display student name and student ID
        String studentName = "Nur Azyratie Rehana Binti Abdul Rahman";
        String studentID = "S86052";
        
        System.out.println("Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        
        // ii. Store two marks using variables
        double assignmentMark = 52.0;
        double examMark = 40.5;
        
        // iii. Calculate the total mark
        double totalMark = assignmentMark + examMark;
        
        // iv. Display the total
        System.out.println("Total Mark: " + totalMark);
        
        // v. Display a message based on the total
        System.out.print("Result: ");
        if (totalMark >= 80) {
            System.out.println("Excellent");
        } else if (totalMark >= 50) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
    }
}
