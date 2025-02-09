// 1️⃣ Final Class: Cannot be inherited
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

// 2️⃣ Parent Class with a Final Method
class Parent {
    // Final variable (constant)
    final int MAX_VALUE = 100;

    // Final method (cannot be overridden)
    final void show() {
        System.out.println("This is a final method in the parent class.");
    }
}

// 3️⃣ Child Class
class Child extends Parent {
    // Attempting to override the final method will cause an error
    // void show() { // ❌ ERROR: Cannot override final method
    //     System.out.println("Trying to override final method.");
    // }

    void displayValue() {
        System.out.println("Final variable value: " + MAX_VALUE);

        // Attempting to change the final variable will cause an error
        // MAX_VALUE = 200; // ❌ ERROR: Cannot reassign final variable
    }
}

// Main Class
public class Q10Final {
    public static void main(String[] args) {
        // Using final class
        FinalClass obj1 = new FinalClass();
        obj1.display();

        // Using final variable and method
        Child obj2 = new Child();
        obj2.show();  // Calling final method
        obj2.displayValue(); // Display final variable
    }
}

