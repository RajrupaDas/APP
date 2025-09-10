class BillingSystem {
    public void generateBill(double... prices) {
        double total = 0;
        System.out.println("Bill details:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Item " + (i + 1) + ": $" + prices[i]);
            total += prices[i];
        }
        System.out.println("Total: $" + total);
    }
    
    public static void main(String[] args) {
        BillingSystem billing = new BillingSystem();
        
        billing.generateBill(25.0, 35.0);
        
        billing.generateBill(15.0, 2.5, 5.0);
        
        billing.generateBill(3.0, 2.0, 4.0, 2.5);
    }
}
