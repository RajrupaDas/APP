import java.util.Scanner;

public class nine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {System.out.println("enter positive number");
            n = sc.nextInt();
	} while (n <= 0);
        System.out.println("positive entered");
    }
}

