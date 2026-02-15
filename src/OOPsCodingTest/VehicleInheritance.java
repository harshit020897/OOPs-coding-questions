package OOPsCodingTest;

public class VehicleInheritance {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();

    }
}

class Vehicle
{
    public void start()
    {
        System.out.println("On starting all vehicles make sound");
    }
}

class Car extends Vehicle{
    @Override
    public void start()
    {
        System.out.println("Car engine starts with a roar!");
    }
}

class Bike extends Vehicle{
    @Override
    public void start()
    {
        System.out.println("Bike engine starts with a purr!");
    }
}