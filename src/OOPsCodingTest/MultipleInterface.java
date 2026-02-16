package OOPsCodingTest;

public class MultipleInterface {
    public static void main(String[] args) {
        Flyable f1 = new Duck();
        Swimmable s1 = new Duck();
        f1.fly();
        s1.swim();
    }
}

interface Flyable
{
    void fly();
}

interface Swimmable
{
    void swim();
}

class Duck implements Flyable, Swimmable
{
    public void fly()
    {
        System.out.println("Duck is flying in the sky!");
    }

    public void swim()
    {
        System.out.println("Duck is swimming in the water!");
    }
}
