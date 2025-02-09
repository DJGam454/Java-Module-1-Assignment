// Parent class (Superclass)
class Parent {
    String name = "Parent Class";

    // Constructor
    Parent() {
        System.out.println("Parent class constructor called.");
    }

    // Method in parent class
    void show() {
        System.out.println("Inside Parent Class");
    }
}

// Child class (Subclass)
class Child extends Parent {
    String name = "Child Class";

    // Constructor using super
    Child() {
        super();  // Calls Parent class constructor
        System.out.println("Child class constructor called.");
    }

    // Method demonstrating use of this and super
    void display() {
        System.out.println("Using this: " + this.name);  // Refers to Child class variable
        System.out.println("Using super: " + super.name); // Refers to Parent class variable
    }

    // Overriding parent method
    @Override
    void show() {
        super.show();  // Calls parent class method
        System.out.println("Inside Child Class");
    }
}

// Main class
public class Q8Super {
    public static void main(String[] args) {
        Child obj = new Child(); // Creating object of Child class
        obj.display();  // Demonstrate this and super
        obj.show();  // Demonstrate method overriding with super
    }
}
