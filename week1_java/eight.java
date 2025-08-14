//Leap Year
//Rajrupa Das RA2411026010147
import java.util.Scanner;
public class eight{
  public static void main(String[] args){
    int y=new Scanner(System.in).nextInt();
    System.out.println("Rajrupa Das RA2411026010147");
    if(y%4==0 && y%100!=0)
      System.out.println("Leap year");
    else if(y%100==0 && y%400==0)
      System.out.println("Leap year");
    else
      System.out.println("Not leap year");
  }
}

