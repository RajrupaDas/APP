// Program demonstrating public method access between classes

class ClassA {
    public void display() {
        System.out.println("Message from Class A's public method.");
    }
}

class Three {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.display();
    }
}

