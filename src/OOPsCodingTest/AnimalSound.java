package OOPsCodingTest;

public class AnimalSound {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();
    }
}

class Animal
{
    public void makeSound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Dog says: woof! woof!");
    }
}

class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Cat says: meow! meow!");
    }
}

