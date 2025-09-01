public class Four {
    public static void main(String[] args) {
        PrimeCustomer pc = new PrimeCustomer("Alice Johnson", "alice@example.com", "P001");
        pc.displayDetails();
        pc.accessPrimeFeatures();
    }
}
class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    void displayDetails() {
        System.out.println("User Name: " + name);
        System.out.println("User Email: " + email);
    }
}

class Customer extends User {
    Customer(String name, String email) {
        super(name, email);
    }
}

class Seller extends User {
    Seller(String name, String email) {
        super(name, email);
    }
}

interface PrimeFeatures {
    void accessPrimeFeatures();
}

class PrimeCustomer extends Customer implements PrimeFeatures {
    String customerId;

    PrimeCustomer(String name, String email, String customerId) {
        super(name, email);
        this.customerId = customerId;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Customer ID: " + customerId);
    }

    public void accessPrimeFeatures() {
        System.out.println("This is a prime customer with exclusive benefits.");
    }
}

