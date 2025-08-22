import java.util.Scanner;

public class ShopkeeperSales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sales = new double[7];
        double totalSales = 0.0;

        System.out.println("Enter the sales for 7 days:");
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for Day " + (i + 1) + ": ");
            sales[i] = scanner.nextDouble();
            totalSales += sales[i];
        }

        double lowestSales = sales[0];
        int lowestSalesDay = 1;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < lowestSales) {
                lowestSales = sales[i];
                lowestSalesDay = i + 1;
            }
        }

        System.out.println("\nTotal sales for the week: $" + String.format("%.2f", totalSales));
        System.out.println("Day with the lowest sales: Day " + lowestSalesDay);
        
        scanner.close();
    }
}

