// Program demonstrating a static variable to count objects

class Four {
    static int count = 0;

    public Four() {
        count++;
    }

    public static void main(String[] args) {
        new Four();
        new Four();
        new Four();
        System.out.println("Total number of employees: " + Four.count);
    }
}

