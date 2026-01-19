package StringsAndArrays;
import java.util.*;
public class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows");
        if(sc.hasNextInt())
        {
            int n = sc.nextInt();
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<=i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Please enter a valid integer");
        }
    }
}
