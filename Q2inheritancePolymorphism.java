// Parent class
class B {
    public void methodB() {
        System.out.println("Inside method B");
    }
}

// Child class demonstrating Inheritance & Polymorphism
public class Q2inheritancePolymorphism extends B {
    @Override
    public void methodB() {
        System.out.println("Inside overridden method B in subclass");
    }

    public static void main(String[] args) {
        // Parent class reference to parent object
        B obj1 = new B();
        obj1.methodB();  // Calls B's method

        // Child class reference to child object
        Q2inheritancePolymorphism obj2 = new Q2inheritancePolymorphism();
        obj2.methodB();  // Calls overridden method

        // Parent class reference to child object (Demonstrates Polymorphism)
        B obj3 = new Q2inheritancePolymorphism();
        obj3.methodB();  // Calls overridden method in inheritancePolymorphism
    }
}