import java.util.Scanner;

public class Three
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int totalMarks = 0;

        System.out.println("Enter the marks for 5 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        int highestMark = -1;
        int highestMarkIndex = -1;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > highestMark) {
                highestMark = marks[i];
                highestMarkIndex = i;
            }
        }

        double averageMark = (double) totalMarks / marks.length;

        System.out.println("\nHighest mark: " + highestMark);
        System.out.println("Average mark: " + String.format("%.2f", averageMark));
        System.out.println("Roll number of student with highest mark: " + (highestMarkIndex + 1));
        
        scanner.close();
    }
}

