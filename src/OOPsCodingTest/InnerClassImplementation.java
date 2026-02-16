package OOPsCodingTest;

public class InnerClassImplementation {

    // Outer class variable
    int x = 10;

    // Inner class
    class Inner {

        void display() {
            System.out.println("Inner class accessing outer variable: " + x);
        }
    }

    void showOuter() {
        System.out.println("Outer class variable X: " + x);
    }

    public static void main(String[] args) {

        // Create outer class object
        InnerClassImplementation outer = new InnerClassImplementation();
        outer.showOuter();

        // Create inner class object
        InnerClassImplementation.Inner inner = outer.new Inner();
        inner.display();
    }
}