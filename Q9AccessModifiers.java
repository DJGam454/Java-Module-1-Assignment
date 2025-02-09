// Parent class demonstrating different access modifiers
class AccessModifiersDemo {
    private String privateVar = "Private Variable";
    String defaultVar = "Default (Package-Private) Variable";
    protected String protectedVar = "Protected Variable";
    public String publicVar = "Public Variable";

    // Method to demonstrate access within the same class
    public void showValues() {
        System.out.println("Inside the same class:");
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}

// Child class in the same package
class SubClassSamePackage extends AccessModifiersDemo {
    public void showInheritedValues() {
        System.out.println("\nInside subclass (same package):");
//      System.out.println("Private: " + privateVar); // ❌ Not accessible
        System.out.println("Default: " + defaultVar);  // ✅ Accessible
        System.out.println("Protected: " + protectedVar); // ✅ Accessible
        System.out.println("Public: " + publicVar); // ✅ Accessible
    }
}

// Another class in the same package
public class Q9AccessModifiers {
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        obj.showValues();

        System.out.println("\nAccess from another class in the same package:");
//      System.out.println("Private: " + obj.privateVar); // ❌ Not accessible
        System.out.println("Default: " + obj.defaultVar);  // ✅ Accessible
        System.out.println("Protected: " + obj.protectedVar); // ✅ Accessible
        System.out.println("Public: " + obj.publicVar); // ✅ Accessible

        SubClassSamePackage subObj = new SubClassSamePackage();
        subObj.showInheritedValues();
    }
}
