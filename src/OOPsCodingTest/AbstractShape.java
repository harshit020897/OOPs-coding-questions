package OOPsCodingTest;

public class AbstractShape {
    public static void main(String[] args) {
Shape s1 = new Rectangle(5,3);
Shape s2 = new Circle(4);
s1.getArea();
s2.getArea();
    }
}

abstract class Shape{
    public abstract void getArea();
}

class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println("Rectangle area: " + (length*width) );
    }
}

class Circle extends Shape{
    double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public void getArea()
    {
        System.out.println("Circle area: " + (Math.PI*radius*radius));
    }
}
