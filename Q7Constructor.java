// Class to demonstrate constructors
class Person {
    String name;
    int age;

    // 1️⃣ Default Constructor
    public Person() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor called!");
    }

    // 2️⃣ Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor called!");
    }

    // 3️⃣ Copy Constructor
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
        System.out.println("Copy Constructor called!");
    }

    // Method to display Person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class
public class Q7Constructor {
    public static void main(String[] args) {
        // Using Default Constructor
        Person person1 = new Person();
        person1.display();

        // Using Parameterized Constructor
        Person person2 = new Person("Alice", 25);
        person2.display();

        // Using Copy Constructor
        Person person3 = new Person(person2);
        person3.display();
    }
}
