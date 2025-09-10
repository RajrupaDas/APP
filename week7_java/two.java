class Bank {
    public double rateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    public double rateOfInterest() {
        return 8.4;
    }
}

class ICICI extends Bank {
    @Override
    public double rateOfInterest() {
        return 7.3;
    }
}

class Main {
    public static void main(String[] args) {
        Bank bank;
        
        bank = new SBI();
        System.out.println("SBI Rate of Interest: " + bank.rateOfInterest() + "%");
        
        bank = new ICICI();
        System.out.println("ICICI Rate of Interest: " + bank.rateOfInterest() + "%");
    }
}
