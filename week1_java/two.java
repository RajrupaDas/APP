//voting eligibility checking
//Rajrupa Das RA2411026010147
import java.util.Scanner;
public class two{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	System.out.println("Rajrupa Das RA2411026010147");
        System.out.print("Enter age: ");
        int age=sc.nextInt();
        if (age>=18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");
    }
} 

