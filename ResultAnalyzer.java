import java.util.Scanner;

public class ResultAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Asking student's name
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        // 2. Asking for marks in 3 subjects
        System.out.print("Enter marks for Subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double subject3 = scanner.nextDouble();

        // 3. Calculating total marks
        double totalMarks = subject1 + subject2 + subject3;

        // 4. Calculating average (using type casting concept implicitly via double division)
        double averageMarks = totalMarks / 3.0;

        // 5. Checking whether the student passed (Assuming passing marks are 40 or above per subject)
        boolean isPassed = subject1 >= 40 && subject2 >= 40 && subject3 >= 40;

        // 6. Checking whether the student got distinction (Assuming average >= 75 and passed)
        boolean isDistinction = isPassed && averageMarks >= 75;

        // 7. Checking whether the student deserves a special award (e.g., scoring 100 in any subject)
        boolean deservesSpecialAward = subject1 == 100 || subject2 == 100 || subject3 == 100;

        // Determining final status string
        String status;
        if (isPassed) {
            if (isDistinction) {
                status = "Passed with Distinction";
            } else {
                status = "Passed";
            }
        } else {
            status = "Failed";
        }

        // 8. Displaying the final result
        System.out.println("\n=================================");
        System.out.println("      STUDENT RESULT REPORT      ");
        System.out.println("=================================");
        System.out.println("Student Name : " + studentName);
        System.out.println("Total Marks  : " + totalMarks + " / 300");
        System.out.printf("Average Marks: %.2f%%\n", averageMarks);
        System.out.println("Final Status : " + status);
        
        if (deservesSpecialAward) {
            System.out.println("Special Award: Yes! Congratulations on a perfect score in a subject.");
        } else {
            System.out.println("Special Award: No");
        }
        System.out.println("=================================");

        // Close the scanner
        scanner.close();
    }
}