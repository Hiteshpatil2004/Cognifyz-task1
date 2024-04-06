import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of grades
        System.out.print("Enter the number of subjects: ");
        int numOfGrades = scanner.nextInt();

        // Create an array to store the grades
        int[] grades = new int[numOfGrades];

        // Prompt user to enter each grade
        for (int i = 0; i < numOfGrades; i++) {
            System.out.print("Enter subject marks:- " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Calculate the sum of grades
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        // Calculate the average grade
        double average = (double) sum / numOfGrades;

        // Display the average grade
        System.out.println("Average marks: " + average);

        scanner.close();
    }
}
