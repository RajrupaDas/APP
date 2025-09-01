public class Three {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5);
        lion.displayDetails();
        lion.roar();
        System.out.println();

        Elephant elephant = new Elephant("Dumbo", 10);
        elephant.displayDetails();
        elephant.trumpet();
        System.out.println();

        Monkey monkey = new Monkey("George", 3);
        monkey.displayDetails();
        monkey.climb();
    }
}
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Lion extends Animal {
    Lion(String name, int age) {
        super(name, age);
    }

    void roar() {
        System.out.println(name + " roars loudly.");
    }
}

class Elephant extends Animal {
    Elephant(String name, int age) {
        super(name, age);
    }

    void trumpet() {
        System.out.println(name + " trumpets majestically.");
    }
}

class Monkey extends Animal {
    Monkey(String name, int age) {
        super(name, age);
    }

    void climb() {
        System.out.println(name + " climbs a tree.");
    }
}

