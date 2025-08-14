//grading
//Rajrupa Das RA2411026010147
import java.util.Scanner;
public class Grade{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Rajrupa Das RA2411026010147");
    System.out.print("Enter your exam score: ");
    int s=sc.nextInt();
    switch(s/10) {
      case 10: case 9: System.out.println("A (Excellent)"); break;
      case 8: System.out.println("B (Very Good)"); break;
      case 7: System.out.println("C (Good)"); break;
      case 6: System.out.println("D (Satisfactory)"); break;
      case 5: case 4: case 3: case 2: case 1: case 0: System.out.println("F (Fail)"); break;
      default: System.out.println("Invalid score");
    }
  }
}

