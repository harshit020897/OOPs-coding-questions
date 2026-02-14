package OOPsCodingTest;

import org.w3c.dom.ls.LSOutput;

public class PersonClassImplementation {

    public static void main(String[] args) {

        person p1 = new person("John", 25);
        person p2 = new person("Alice", 30);
        System.out.println("Name: " + p1.name + ", Age: " + p1.age + " Name: " + p2.name + ", Age: " + p2.age);
    }

}

class person
{
    String name ;
    int age ;

    person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
