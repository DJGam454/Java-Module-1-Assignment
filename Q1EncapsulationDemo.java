// Encapsulation example in Java
class Person {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) { // Validation to ensure age is positive
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class Q1EncapsulationDemo {
    public static void main(String[] args) {
        Person person = new Person();

        // Setting values using setter methods
        person.setName("John Doe");
        person.setAge(25);

        // Getting values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
