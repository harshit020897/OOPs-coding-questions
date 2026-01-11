package CodingTest11Jan;
import java.sql.SQLOutput;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextInt()) {
            int x = sc.nextInt();
            int temp = x;
            int rev = 0;

            do {
                rev = rev * 10 + (x % 10);
                x = x / 10;
            } while (x > 0);
            System.out.println("Reversed number is: " + rev);
        }

        else {
            System.out.println("Please enter a valid integer");
        }
    }
}
