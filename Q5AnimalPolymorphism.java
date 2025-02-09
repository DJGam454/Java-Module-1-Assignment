// Base class (Super class)
class Animal {
    // Polymorphic method
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class (Subclass 1)
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}

// Derived class (Subclass 2)
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow meow!");
    }
}

// Main class
public class Q5AnimalPolymorphism {
    public static void main(String[] args) {
        // Parent class reference pointing to a child class object (Polymorphism)
        Animal myAnimal1 = new Dog();  // Dog object
        Animal myAnimal2 = new Cat();  // Cat object

        // Calls overridden methods based on actual object type (Runtime Polymorphism)
        myAnimal1.makeSound();  // Output: Dog barks: Woof woof!
        myAnimal2.makeSound();  // Output: Cat meows: Meow meow!

        // Using an array of Animal objects
        Animal[] animals = { new Dog(), new Cat(), new Animal() };

        System.out.println("\nUsing Polymorphism in an Array:");
        for (Animal animal : animals) {
            animal.makeSound();  // Calls the overridden method dynamically
        }
    }
}