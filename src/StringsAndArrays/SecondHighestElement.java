package StringsAndArrays;
import java.util.*;
public class SecondHighestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        if(sc.hasNextInt())
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Please enter the elements of array");
            for(int i = 0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }

            int highest = 0;
            int SecondHighest = 0;

            for(int i=0; i<n; i++)
            {
                if(arr[i]>highest)
                {
                    SecondHighest = highest;
                    highest = arr[i];
                }
                else if (arr[i]>SecondHighest && arr[i]!=highest)
                {
                    SecondHighest = arr[i];
                }
            }
            System.out.println("Second Highest element is: " + SecondHighest);
        }
        else
        {
            System.out.println("Please enter a valid integer");
        }
    }
}
