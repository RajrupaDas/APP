import java.util.Scanner;

public class three{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int si = (p * r * i) / 100;
            System.out.println(si);
        }
    }
}

