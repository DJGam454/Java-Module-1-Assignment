class A {
    public void M1(){
        System.out.println("hello");
    }

    // Overloading
    public void M1(int a, int b){
        System.out.println(a + b);
    }
}

public class Q4OverridingOverloading extends A {
    // overriding
    public void M1(){
        System.out.println("Overriden Method");
    }
    public static void main(String[] args) {
        Q4OverridingOverloading obj = new Q4OverridingOverloading();
        obj.M1();

        A obj2 = new A();
        obj2.M1();
        obj2.M1(10,12);
    }

}