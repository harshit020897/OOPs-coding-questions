import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int n1 = sc.nextInt();

        if(n1<=59)
        {
            System.out.println("F");
        }
        else if(n1>59 && n1<=69)
        {
            System.out.println("D");
        }
        else if(n1>69 && n1<=79)
        {
            System.out.println("C");
        }
        else if(n1>79 && n1<=89)
        {
            System.out.println("B");
        }
        else if(n1>89 && n1<=100)
        {
            System.out.println("A");
        }
    }
}
