package OOPsCodingTest;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class DrawableInterface {
    public static void main(String[] args) {
        Drawable c1 = new Circle1();
        Drawable r1 = new Rectangle1();

        c1.draw();
        r1.draw();

    }
}

 interface Drawable
{
    public void draw();

}

class Circle1 implements Drawable
{
    public void draw()
    {
        System.out.println("Drawing a circle");
    }
}

class Rectangle1 implements Drawable
{
    public void draw()
    {
        System.out.println("Drawing a rectangle");
    }
}
