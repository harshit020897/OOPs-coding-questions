package OOPsCodingTest;

public class MethodOverloading {
    int add(int a, int b)
    {
        return (a+b);
    }

    double add(double a, double b)
    {
        return (a+b);
    }

    int add(int a, int b, int c)
    {
        return (a+b+c);
    }

    public static void main(String[] args) {

        MethodOverloading m1 = new MethodOverloading();
        System.out.println("Integer addition: " + m1.add(2,3));
        System.out.println("Double addition: " + m1.add(3.5, 4.7));
        System.out.println("Three integers addition: " + m1.add(4, 8, 12));


    }
}
