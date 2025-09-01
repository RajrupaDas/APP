public class Five {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.displayRate();
    }
}
class Bank {
    double interestRate = 5.0;

    void displayRate() {
        System.out.println("Bank's interest rate: " + interestRate + "%");
    }
}

class SBI extends Bank {
    double interestRate = 7.5;

    void displayRate() {
        System.out.println("SBI's interest rate: " + this.interestRate + "%");
        System.out.println("Parent Bank's interest rate: " + super.interestRate + "%");
    }
}

