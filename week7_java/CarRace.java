import java.util.Random;

public class CarRace {

    public static void main(String[] args) {
        Thread carA = new Thread(new Car("Car A"));
        Thread carB = new Thread(new Car("Car B"));
        Thread carC = new Thread(new Car("Car C"));

        carA.start();
        carB.start();
        carC.start();
    }
}

class Car implements Runnable {
    private String name;
    private int distance = 0;
    private static final int RACE_DISTANCE = 100;
    private Random random = new Random();

    Car(String name) {
        this.name = name;
    }

    public void run() {
        while (distance < RACE_DISTANCE) {
            int step = random.nextInt(11) + 5;
            distance += step;
            System.out.println(name + " has traveled " + distance + " meters.");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(name + " has finished the race!");
    }
}

