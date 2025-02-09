// First interface
interface Vehicle {
    void start();  // Abstract method
}

// Second interface
interface Engine {
    void accelerate();  // Abstract method
}

// Class implementing multiple interfaces
class Truck implements Vehicle, Engine {
    @Override
    public void start() {
        System.out.println("Truck is starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck is accelerating...");
    }
}

// Main class
public class Q6MultipleInheritance {
    public static void main(String[] args) {
        Truck myTruck = new Truck();  // Creating object of Truck

        // Calling methods from both interfaces
        myTruck.start();         // From Vehicle interface
        myTruck.accelerate();    // From Engine interface
    }
}
