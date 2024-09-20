import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Create a Scanner object to read input from STDIN
        Scanner input = new Scanner(System.in);
        
        // Read two integers from the input
        int a = input.nextInt();
        int b = input.nextInt();
        
        // Output the sum of a and b
        System.out.println((a + b));
        
        // Close the scanner
        input.close();
    }
}
