//Calculator
//Rajrupa Das RA2411026010147
import java.util.Scanner;
public class seven{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Rajrupa Das RA2411026010147");
    System.out.println("Enter 1 for addition or 2 for subtraction.");
    int choice=sc.nextInt();
    if(choice==1) {
      int a=sc.nextInt(), b=sc.nextInt();
      System.out.println("Sum: "+(a+b));
    } else if(choice==2) {
      int a=sc.nextInt(), b=sc.nextInt();
      System.out.println("Difference: "+(a-b));
    } else {
      System.out.println("Invalid choice");
    }
    sc.close();
  }
}

