// check if number is positive, negative or zero
// Rajrupa Das RA2411026010147
import java.util.Scanner;
public class five{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0) 
		System.out.println("Negative");
        else if(n>0) 
		System.out.println("Positive");
        else 
		System.out.println("Zero");
    }
}

