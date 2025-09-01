import java.util.*;
public class One {
    public static void main(String[] args) {
        MathTeacher mt = new MathTeacher("John Doe", "Mathematics", 5);
        mt.displayDetails();
    }
}

class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

class MathTeacher extends Teacher {
    int numberOfClasses;

    MathTeacher(String name, String subject, int numberOfClasses) {
        super(name, subject);
        this.numberOfClasses = numberOfClasses;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of classes handled: " + numberOfClasses);
    }
}


