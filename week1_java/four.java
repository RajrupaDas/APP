//Temperature checker
//Rajrupa Das RA2411026010147
import java.util.Scanner;
public class four{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	System.out.println("Rajrupa Das RA2411026010147");
        System.out.print("Enter the temperature in celcius: ");
        int temp=sc.nextInt();
        if (temp>30)
            System.out.println("It is hot");
        else if (temp>=20)
            System.out.println("It is warm");
        else if (temp>=10)
            System.out.println("It is cool");
        else
            System.out.println("It is cold");
    }
}

