package OOPsCodingTest;

class Parent
{
    void display()
    {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent{
    @Override
    void display() {
        System.out.println("Child class display method");;
    }
}


public class MethodOverriding {
    public static void main(String[] args) {

        Parent p1 = new Parent();
        Parent p2 = new Child();
        p1.display();
        p2.display();

    }
}
