 import java.util.*;

public class CGPACalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        double totalmarks = 0;
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            double gradePoint = scanner.nextDouble();
            totalmarks += gradePoint;  
        }
        double cgpa = totalmarks / numberOfSubjects;
        System.out.println("Your CGPA is: " + cgpa);
        scanner.close();
    }
}

