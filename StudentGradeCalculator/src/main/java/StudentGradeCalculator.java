import java.util.Scanner;

public class StudentGradeCalculator {

    public static float averagePercentage(int totalMarks , int numberOfSubjects) {
        float averagePercentage;
        averagePercentage = Math.round(totalMarks / numberOfSubjects);
        return averagePercentage;
    }

    public static char grade(float averagePercentage) {
        char grade;
        if (averagePercentage <= 100 && averagePercentage > 85) {
            grade = 'A';
        }
        else if (averagePercentage <= 85 && averagePercentage > 70) {
            grade = 'B';
        }
        else if (averagePercentage <= 70 && averagePercentage > 55) {
            grade = 'C';
        }
        else if (averagePercentage <= 55 && averagePercentage > 40) {
            grade = 'E';
        }
        else {
            grade = 'F';
        }
        return grade;
    }

    public static void displayResult(int totalMarks, float averagePercentage, char grade) {
        System.out.println("Total marks obtained by the student out of 500 is : " + totalMarks);
        System.out.println("Average Percentage obtained by the student is : " + averagePercentage);
        System.out.println("Grade obtained by the student is : " + grade);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        final int numberOfSubjects = 5;  // mathematics, english, computer science, physics, chemistry respectively
        int totalMarks = 0 ;
        int i = 1 ;
        while (i <= numberOfSubjects) {
            System.out.print("Enter marks of subject " + i + " : " );
            int marks = scn.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Marks should be between 0 and 100");
            }
            else {
                totalMarks += marks;
                i++;
            }
        }
        float averagePercentage = averagePercentage(totalMarks, numberOfSubjects);
        char grade = grade(averagePercentage);
        displayResult(totalMarks, averagePercentage, grade);
    }
}
