import java.util.Scanner;

public class seven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, i = 2;
        do {
            sum += i;
            i += 2;
        } while (i <= n);
        System.out.println(sum);
    }
}

